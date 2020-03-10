package me.livenow.spirngframework.demospringboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository @Primary
public class TJBookRepository implements BookRepository {
}
