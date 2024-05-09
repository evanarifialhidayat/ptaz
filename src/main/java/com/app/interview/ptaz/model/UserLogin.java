package com.app.interview.ptaz.model;

import java.beans.Transient;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "userlogin" )
public class UserLogin {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    
    @Column(name="nama")
	public String nama ;
    
    @Column(name="email")
    @NotBlank(message = "Name cannot blank")
    @Size(max = 100, message = "Email should not be greater than 100 caracters")
    @Email(message = "Email format not correct")
	public String email ;
	
	@Column(name="katasandi")
	@NotBlank(message = "Name cannot blank")
    @Size(min = 6, max = 80, message = "Password must have at least 6 caracters and maximum 40")
	public String katasandi;	
	
	@Column(name="token")
	public String token;
	
    
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getId_seq() {
		return id_seq;
	}

	public void setId_seq(Long id_seq) {
		this.id_seq = id_seq;
	}	

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKatasandi() {
		return katasandi;
	}

	public void setKatasandi(String katasandi) {
		this.katasandi = katasandi;
	}

	@Override
	public String toString() {

				return "{\"recid\":"+       id_seq 
				+ ", \"nama\":\"" +         nama 
				+ "\", \"email\":\"" +      email 
				+ "\", \"katasandi\":\"" +  katasandi
				+ "\", \"token\":\"" +  token
				+ "\", \"id_seq\":\"" +     id_seq
				+"\"}";
	}
	
	
	


	

    
}

