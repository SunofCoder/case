## Soru 1 - MVC kavramını açıklar mısınız ? Neden ihtiyaç duyuluyor. Java’da nasıl kurgulanıyor. Object Oriented katmanları nelerdir ?

## Cevap:

MVC(ModelViewController) bir yazılım tasarım modelidir.Veri, yazılım ve gösterimin birbirinden soyutlanması esasına dayanır.
#### Model:
Veritabanı ,prosedürler ve işleyiş kuralları da bu bölümde yer alır.
#### View:
Uygulamanın kullanıcı arayüzünün oluşturulduğu ve arayüz dosyalarının bulunduğu katmandır.
#### Controller:
Uygulamaya gelen talepleri yöneten katmandır.Controller, modeli ve view’i birbirine bağlar.
Mvc sayesinde projede yer alan işlerim birbirine karışmamasını sağlarız. Bu Sayede yönetilibilir açısında avantaj sağlıyor.
Mvc yapısını Javada uygulaamak için üç tane sınıfa ihtiyaç var.Örnek vermek gerekirs,

####  StudentClass,
#### StudentView Class,
#### StudentContoller Class.

## Object Oriented katmanları nelerdir ?
### Soyutlama (Abstraction):
Bir classın özelliklerinin ve davranışlarının tanımlanmasına denir.
### Kapsülleme (Encapsulation):
Class’a ait property’ler her classın istediği gibi erişmesini ve değiştirmesini engellemektir.Erişim kısıtlanmayacaksa bile erişimi getter/setter methodları gibi yöntemlerle kontrol altına almaktır.
### Miras Alma (Inheritance):
herhangi bir class’ın üst class’larına ait olan method ve propertyleri kalıtım yoluyla almasıdır.
### Çok Biçimlilik (Polymorphism):
bir üst sınıf referansının tüm alt sınıf nesnelerini tutabilmesidir.

## Soru 2 - Birbirinden bağımsız iki platformun birbiriyle haberleşmesi nasıl sağlanabilir. Örneğin, X platformu Java ile yazılmış olsun, Y platform u C# ile. Bu iki platformun bir biri ile iletişim halinde request-response ilişkisi kurması gerekiyor. Bu  yapıyı nasıl sağlarız.

## Cevap:
Servis mimarisi kullanırım .Rest Kullanırım.

## Soru 3 - Bir web sayfasında ekran sürekli Backend’ den veya bir başka yapı tarafından güncelleniyor. Siz, web sayfasını refresh etmeden bu güncel bilgiyi anlık ekrana nasıl yansıtırsınız?

## Cevap:

Javascipt kullanıyorsak jquery ajax ile güncelleme işlemi yapılabir.
Buna ek olarak React için useState kullanırım.



## Soru 4 - Bir for döngüsü ile aşağıdaki çıktıyı yazar mısınız.

```
*
**
****
******
********
**********
```
## Cevap:

```java
public class Main {
public static void main(String[] args) {

        int star = 1;
        for (int i = 0; i <=9; i++) {
            for(int j =0; j<star; j++){
                System.out.print("*");
            }
            System.out.println();
            star++;

            }
        }

    }
```

## Soru 5 - Firmada çalışman için sana remote bir linux server verildi. Elinde ip adresi port bilgisi kullanıcı adi ve şifren var. Server a erişimi nasıl test edersin, Server a nasıl erişirsin, Server a nasıl dosya atarsın, Serverdan nasıl dosya çekersin.

## Cevap:
Servera erişmek için SSH protokolunu kullanırım. Kullanım şekli ise ssh{user}@{host}

```shell
    ssh {user}@{host}
    ssh username@ipaddress:port
```

ssh :Kullanılan protokol
User :Sunucu kullanıcı adınız
Host:Sunucu ip adresi bilgilerini girmemiz gerekmektedir.
Bağlandıktan sonra
```shell
    ls-la
```
ile sunucuda olan dosya ve klasörleri görebilirim.
```shell
    scp [dosyaAdi] [kullaniciAdi@IPAdresi:uzanti]
```
ve şifreyi girdikten sonra dosya transferi tamamlanır.kontrol etmek amacıyla tekrardan
```shell
    ls-la
```  
ile kontrol edebiliriz.

## Soru 6- Spring Case
## Cevap:
Veritabanı olarak Postgresql kurdum.
Dependencyleri ekledim.

Kullanılan Katmanlar:
Controller
Exception
Model
Repository
Payload
Service


Backend Kısmı:
Intellj IDEA
Java 11
Spring Boot
Spring Data Jpa
Postgresql
Maven
Postman client




## Soru 7- Apache Solr servisine yazılacak bir query örneği Apache Solr kullanılan sql programlarından daha farklı runtime bir database. Solr a hali hazırda kayıtlı bir alan olduğunu düşünelim. Alanın ismi “updatedAt” long tipinde tutulan bir alan. Ben 2020 Ocak ayından sonraki verileri getir dediğimde solr a nasıl bir query yazılmalı. http://example?query= kısmını nasıl doldurmalıyım?
## Cevap:

http://example?query=updatedAt[20200101TO*]
