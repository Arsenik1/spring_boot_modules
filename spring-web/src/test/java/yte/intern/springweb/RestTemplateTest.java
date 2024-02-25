package yte.intern.springweb;

import org.junit.jupiter.api.Test;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;


public class RestTemplateTest {

    private final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test
    public void getPosts()
    {
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();
        RestTemplate restTemplate = new RestTemplate();
        RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();
        ResponseEntity<Post[]> exchange = restTemplate.exchange(requestEntity, Post[].class);
        System.out.println(Arrays.stream(exchange.getBody()).toList());
    }
    @Test
    public void getPostsID2()
    {
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();
        RestTemplate restTemplate = new RestTemplate();
        RequestEntity<Void> requestEntity = RequestEntity.get(uri).header("Key", "value").build();
        ResponseEntity<Post[]> exchange = restTemplate.exchange(requestEntity, Post[].class);
        System.out.println(Arrays.stream(exchange.getBody()).toList());
    }
    @Test
    public void addPost()
    {
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();

        RequestEntity<Post> requestEntity = RequestEntity.post(uri).body(new Post(1L, 1L, "title", "body"));
        ResponseEntity<Post> response = restTemplate.exchange(request, Post.class);
        System.out.println(response.getBody());
    }

    @Test
    public void getPostById()
    {
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();
        RequestEntity<Void> requestEntity = RequestEntity.get(uri).build();


        ResponseEntity<Post> response = restTemplate.exchange(request, Post.class);
        System.out.println(response.getBody());
    }

    @Test
    public void updateComment()
    {
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();
        RequestEntity<Comment> request = RequestEntity
                .put(uri)
                .body(new Comment(9L, 5L, "dsasd", "sadf@dsad@com", "asdasd"));


        ResponseEntity<Post> response = restTemplate.exchange(request, Post.class);
        System.out.println(response.getBody());
    }

    @Test
    public void deletePost()
    {
        URI uri = UriComponentsBuilder.fromHttpUrl(BASE_URL)
                .pathSegment("posts")
                .build()
                .toUri();

        RestTemplate restTemplate = new RestTemplate();

        RequestEntity<Void> request = RequestEntity.delete(uri).build();
        ResponseEntity<Void> response = restTemplate.exchange(request, Void.class);
        System.out.println(response.getStatusCode());
    }
}
