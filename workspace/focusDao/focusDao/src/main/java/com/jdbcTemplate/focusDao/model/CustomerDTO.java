package com.jdbcTemplate.focusDao.model;

import java.util.Date;

public class CustomerDTO {

    private int idDto;
    private String nameDto;
    private int ageDto;
    private Date dateDto;

    public CustomerDTO(int idDto, String nameDto, int ageDto, Date dateDto) {
        this.idDto = idDto;
        this.nameDto = nameDto;
        this.ageDto = ageDto;
        this.dateDto = dateDto;
    }

    public CustomerDTO() {
    }

    public int getIdDto() {
        return idDto;
    }

    public void setIdDto(int idDto) {
        this.idDto = idDto;
    }

    public String getNameDto() {
        return nameDto;
    }

    public void setNameDto(String nameDto) {
        this.nameDto = nameDto;
    }

    public int getAgeDto() {
        return ageDto;
    }

    public void setAgeDto(int ageDto) {
        this.ageDto = ageDto;
    }

    public Date getDateDto() {
        return dateDto;
    }

    public void setDateDto(Date dateDto) {
        this.dateDto = dateDto;
    }
}
