package org.example.restfulapidesignswagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Müşteri Veri Transfer Objesi")
public class CustomerDTO {

    @Schema(description = "Müşterinin sistemdeki benzersiz kimliği", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "Müşterinin tam adı", example = "Ahmet Yılmaz")
    private String name;

    @Schema(description = "Müşterinin e-posta adresi", example = "ahmet.yilmaz@example.com")
    private String email;

    // Boş Constructor
    public CustomerDTO() {
    }

    // Entity'den DTO'ya dönüşüm için pratik Constructor
    public CustomerDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter ve Setter Metodları
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}