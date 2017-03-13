package com.omegacode.entity;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "USERS")
@SequenceGenerator(name = "SeqGeneral", sequenceName = "SEQ_GENERAL")
public class User implements UserDetails {

	private static final long serialVersionUID = 1L;

    /** compulsory first screen attributes */

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeqGeneral")
	private BigInteger id;

	@Size(min=2,max=30)
	@Column(name = "login")
	private String username;
//	displayed name a 
	@Transient
	private String displayedName;
//	email change_1
	@Email
	@NotNull
	private String email;

	/** optional first screen attributes */
//  fnamea2c 444
	private String fname;
//	lname2aa6 4
	private String lname;

//
//	/** lifecycle and customization attributes */
//
//	private Size defaultSize;
//
//	/** e.g. "normal" and "pregnant" */
//	private List<Size> sizes;
//	private List<Wardrobe> wardrobes;
//	
	@javax.persistence.Transient
	@NotNull
    @Size(min=5,max=30)
	private String password1;
	
	@javax.persistence.Transient
	@NotNull
    @Size(min=5,max=30)	
	private String password2;
	
	private String passwordEncrypted;
	@javax.persistence.Transient
	private boolean confirmationStatus;
	private String confirmationId;
	
	

	/**
     * @return the passwordEncrypted
     */
    public String getPasswordEncrypted() {
        return passwordEncrypted;
    }

    /**
     * @param passwordEncrypted the passwordEncrypted to set
     */
    public void setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }

    /**
     * @return the confirmationStatus
     */
    public boolean isConfirmationStatus() {
        return confirmationStatus;
    }

    /**
     * @param confirmationStatus the confirmationStatus to set
     */
    public void setConfirmationStatus(boolean confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    /**
     * @return the confirmationId
     */
    public String getConfirmationId() {
        return confirmationId;
    }

    /**
     * @param confirmationId the confirmationId to set
     */
    public void setConfirmationId(String confirmationId) {
        this.confirmationId = confirmationId;
    }

    public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("USER"));
	}


	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

	/**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
     */
    @Override
    public String getPassword() {
        return passwordEncrypted;
    }

    /* (non-Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
     */
    @Override
    public boolean isEnabled() {
        return true;
    }

    /**
     * @return the displayedName
     */
    public String getDisplayedName() {
        return displayedName;
    }

    /**
     * @param displayedName the displayedName to set
     */
    public void setDisplayedName(String displayedName) {
        this.displayedName = displayedName;
    }

}

