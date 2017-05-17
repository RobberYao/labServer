package com.labServer.entity;

import java.util.Date;

public class LabInputParamter {


  private Integer id;
  private String inputProbeNumber;
  private String createdOn;
  private Double inputTemperature;
  private Double inputHumidity;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getInputProbeNumber() {
    return inputProbeNumber;
  }

  public void setInputProbeNumber(String inputProbeNumber) {
    this.inputProbeNumber = inputProbeNumber;
  }

  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Double getInputTemperature() {
    return inputTemperature;
  }

  public void setInputTemperature(Double inputTemperature) {
    this.inputTemperature = inputTemperature;
  }

  public Double getInputHumidity() {
    return inputHumidity;
  }

  public void setInputHumidity(Double inputHumidity) {
    this.inputHumidity = inputHumidity;
  }

  @Override
  public String toString() {
    return "LabInputparamter [inputProbeNumber=" + inputProbeNumber + ", createdOn=" + createdOn
        + ", inputTemperature=" + inputTemperature + ", inputHumidity=" + inputHumidity + "]";
  }

  public LabInputParamter(String inputProbeNumber, String createdOn, Double inputTemperature,
      Double inputHumidity) {
    super();
    this.inputProbeNumber = inputProbeNumber;
    this.createdOn = createdOn;
    this.inputTemperature = inputTemperature;
    this.inputHumidity = inputHumidity;
  }

  public LabInputParamter() {
    super();
  }



}
