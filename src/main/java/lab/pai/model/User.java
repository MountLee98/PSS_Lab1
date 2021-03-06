package lab.pai.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
	@Column(nullable = false)
    private String companyName;
	@Column(nullable = false)
    private String companyAddress;
	@Column(nullable = false)
    private int companyNip;
	@Column(nullable = false)
    private String name;    
	@Column(nullable = false)
    private String lastName;
	@Column(nullable = false)
    private String email;
	@Column(nullable = false)
    private String password;
    @Column(columnDefinition = "boolean default true")
    private Boolean status;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime registrationDate; 
    @Column(columnDefinition = "role default role_user")
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId")
    private List<Role> role;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "delegationId")
    private List<Delegation> delegation;
    
    
    public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public int getCompanyNip() {
		return companyNip;
	}
	public void setCompanyNip(int companyNip) {
		this.companyNip = companyNip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public List<Delegation> getDelegation() {
		return delegation;
	}
	public void setDelegation(List<Delegation> delegation) {
		this.delegation = delegation;
	}
}
