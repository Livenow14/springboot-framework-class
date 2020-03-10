package me.livenow.spirngframework.demospringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component                  //대다수의 경우는 싱글톤을 사용함
public class Single {

    @Autowired
    Proto proto;
    public Proto getProto() {
        return proto;
    }

}
