package com.yoandypv.reactivestack.messages.repository;

import com.yoandypv.reactivestack.messages.domain.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface MessageRepository extends ReactiveMongoRepository<Message, String> {
    Flux<Message> findByThreadId(String threadId);
}
