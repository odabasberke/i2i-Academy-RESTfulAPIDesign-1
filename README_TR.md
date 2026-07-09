Bu proje, Müşteri (Customer) verilerini yönetmek için CRUD operasyonları sunan, Docker üzerinde çalışan gerçek bir ilişkisel veritabanı (Oracle XE) ile entegre ve Swagger UI kullanarak OpenAPI uyumlu dokümantasyon üreten katmanlı bir Spring Boot RESTful uygulamasıdır.

Bu proje, i2i Academy arka uç (backend) mühendisliği ödevlerinin bir parçası olarak geliştirilmiştir.

🚀 Kullanılan Teknolojiler

Java 17+

Spring Boot 3.x (Web, Data JPA)

Oracle Database XE (Docker konteyneri)

Swagger / OpenAPI 3 (springdoc-openapi)

Maven

🏗️ Mimari Yapı

Uygulama; temiz kod, ölçeklenebilirlik ve güvenlik sağlamak amacıyla katı bir 3 Katmanlı Mimari (3-Layered Architecture) ile inşa edilmiştir:

Controller (Kontrolör) Katmanı: Gelen HTTP isteklerini karşılayan ön kapıdır.

Service (Servis) Katmanı: İş mantığının (business logic) çalıştığı ve Entity <-> DTO dönüşümlerinin yapıldığı yerdir.

Repository (Depo) Katmanı: Spring Data JPA kullanarak Oracle veritabanı işlemlerini yürütür.

Data Transfer Objects (DTO - Veri Transfer Objeleri): Veritabanı sınıflarını (Entity) doğrudan dışarıya açmak yerine, verileri filtreleyerek güvenli bir şekilde dış dünyaya sunmak için kullanılmıştır.

🛠️ Ön Koşullar ve Çalıştırma

1. Veritabanı Kurulumu (Docker)

Docker Desktop uygulamasının çalıştığından emin olun. Ardından aşağıdaki komutu terminalde (veya PowerShell'de) çalıştırarak Oracle XE veritabanını ayağa kaldırın:

docker run -d -p 1521:1521 --name oracle-db -e ORACLE_PASSWORD=customer_pass -e APP_USER=customer_db -e APP_USER_PASSWORD=customer_pass gvenzl/oracle-xe


Veritabanının tam olarak hazır olması için 1-2 dakika bekleyin (Loglarda DATABASE IS READY TO USE yazısını görene kadar).

2. Uygulamayı Çalıştırma

Projeyi IDE'niz (IntelliJ IDEA, vb.) üzerinden RestfulApiDesignSwaggerApplication.java sınıfından başlatın veya Maven komutunu kullanın:

mvn spring-boot:run


3. API Dokümantasyonu (Swagger UI)

Uygulama çalıştıktan sonra, yazdığınız API uç noktalarını (endpoints) canlı olarak test etmek için tarayıcınızda şu adrese gidin:
👉 http://localhost:8080/swagger-ui.html
