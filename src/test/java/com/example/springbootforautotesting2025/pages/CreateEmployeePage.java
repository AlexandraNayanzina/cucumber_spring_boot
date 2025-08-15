package com.example.springbootforautotesting2025.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class CreateEmployeePage extends BasePage {

    @FindBy(id = "Name")
    private WebElement txtEmployeeName;

    @FindBy(id = "Salary")
    private WebElement txtEmployeeSalary;

    @FindBy(id = "DurationWorked")
    private WebElement txtEmployeeDurationWorked;

    @FindBy(id = "Grade")
    private WebElement dropDownEmployeeGrade;

    @FindBy(id = "Email")
    private WebElement txtEmployeeEmail;

    @FindBy(xpath = "//input[@value='Create']")
    private WebElement btnCreate;

    public void performEmployeeCreation(String empNamer,
                                                    String salary,
                                                    String durationWorked,
                                                    int gradeIndex,
                                                    String email) {
        var selectGrade = new Select(dropDownEmployeeGrade);
        txtEmployeeName.sendKeys(empNamer);
        txtEmployeeSalary.sendKeys(salary);
        txtEmployeeDurationWorked.sendKeys(durationWorked);
        selectGrade.selectByIndex(gradeIndex);
        txtEmployeeEmail.sendKeys(email);
        btnCreate.click();
    }
}
