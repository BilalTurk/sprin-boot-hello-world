# sprin-boot-hello-world
2 units springboot Application

intelij IDEA da spring initializr uygulaması oluşturdum.
1.UYGULAMA

Bu uygulamada Öncelikle Widget clasını olusturup aşağıdakı kodları yazdım.
package com.example;

/**
 * Created by bilalturk on 11.03.2016.
 */
public class Widget {
    private String type;

    private int length;

    private int height;

    public Widget(String type, int length, int height) {
        this.type = type;
        this.length = length;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
Daha sonrasında ise bu kodların kontrolu ıcın WidgetController clasını olusturup aşağıdaki kodları yazdım.
package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class WidgetController {
    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index() {
        return new Widget("green", 10, 7);
    }
}

Clasları olşturdukdan sonra main.java da aşağdaki kodları yazıp derledim.
localhost:8080/api ile Web tarayıcıda görüntüledim
ekran çıktısı olarak  

{"type":"green","length":10,"height":7}

 görüntülendi...
 
 
 
 2.UYGULAMA
 
 Bu uygulamada Öncelikle Man clasını olusturup aşağıdakı kodları yazdım.
 
