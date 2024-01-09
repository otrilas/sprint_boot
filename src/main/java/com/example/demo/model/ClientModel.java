package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class ClientModel {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;
   @Column(length = 3)
   private String documentType;
   @Column(length = 20)
   private String documentNumber;
   @Column(length = 50)
   private String firstname;
   @Column(length = 50)
   private String secondname;
   @Column(length = 50)
   private String firstApellido;
   @Column(length = 50)
   private String secondApellido;
   @Column(nullable = false, length = 20)
   private String numberphone;
   @Column(length = 250)
   private String address;
   @Column(length = 20)
   private String residencia;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getDocumentType() {
      return documentType;
   }

   public void setDocumentType(String documentType) {
      this.documentType = documentType;
   }

   public String getDocumentNumber() {
      return documentNumber;
   }
   public void setDocumentNumber(String documentNumber) {
      this.documentNumber = documentNumber;
   }

   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getSecondName() {
      return secondname;
   }

   public void setSecondName(String secondname) {
      this.secondname = secondname;
   }

   public String getFirstApellido() {
      return firstApellido;
   }

   public void setFirstApellido(String firstApellido) {
      this.firstApellido = firstApellido;
   }

   public String getSecondApellido() {
      return secondApellido;
   }

   public void setSecondApellido(String secondApellido) {
      this.secondApellido = secondApellido;
   }

   public String getNumberphone() {
      return numberphone;
   }

   public void setNumberphone(String numberphone) {
      this.numberphone = numberphone;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getResidencia() {
      return residencia;
   }

   public void setResidencia(String residencia) {
      this.residencia = residencia;
   }
}
