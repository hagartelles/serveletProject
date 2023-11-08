package model;

import java.time.LocalDate;
import java.util.Date;

public class Client {

	private long id;
	private long cpf;
	private String nome;
	private LocalDate bornDate;
	private String adress;
	private String email;
	private long tel;
	private LocalDate createdTime;

	public Client(long id, long cpf, String nome, LocalDate bornDate, String adress, String email, long tel,
			LocalDate createdTime) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.bornDate = bornDate;
		this.adress = adress;
		this.email = email;
		this.tel = tel;
		this.createdTime = createdTime;
	}
	
	public Client() {
   		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}
	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}

	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}

	public LocalDate getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(LocalDate createdTime) {
		this.createdTime = createdTime;
	}
}
