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
 internet üzerinden bulduğum diğer uygulamaya benzer bir uygulamada kendim yaptım...
 
 
 Bu uygulamada Öncelikle Man clasını olusturup aşağıdakı kodları yazdım.
 
package com.example;

/**
 * Created by bilalturk on 11.03.2016.
 */
public class Man {
    private String name;
    private int age;
    private  String hairColor;

    public Man(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }
}

Daha sonrasında ise bu kodların kontrolu ıcın ManController clasını olusturup aşağıdaki kodları yazdım.

package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Man")
@RestController
public class ManController {
    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Man index() {
        return new Man("bilal",23,"black");
    }

}

projeyi Derleyip-Çalıştırıp 

localhost:8080/Man yolu ekranda çıktıyı gördüm ekrandaki çıktı ;

{"name":"bilal","age":23,"hairColor":"black"}

uygulamayı tamamladım...
