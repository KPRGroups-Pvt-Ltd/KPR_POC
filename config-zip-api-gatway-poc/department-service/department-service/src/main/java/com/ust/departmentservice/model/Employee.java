package com.ust.departmentservice.model;
/**
 * Created by Sangharatna Davane
 * Date : 27-03-2024
 * Time : 19:34
 * Project Name :KPR_POC
 */
public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
