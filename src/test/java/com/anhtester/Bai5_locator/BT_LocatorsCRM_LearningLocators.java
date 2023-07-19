package com.anhtester.Bai5_locator;

public class BT_LocatorsCRM_LearningLocators {

    //Login page
    public static String headersLoginPage="//h1[normalize-space()='Login']";
    public static String inputEmail ="//input[@id='email']";
    public static String inputPassword="//input[@id='password']";
    public static String buttonLogin ="//button[normalize-space()='Login']";
    public static String linkForgotPassword="//a[normalize-space()='Forgot Password?']";

    //Dasboard page
    public static String menuCustomers ="//span[normalize-space()='Customers']";
    public static String menuProjects="//span[normalize-space()='Projects']";
    public static String menuTasks="//span[normalize-space()='Tasks']";
    public static String menuDasboard ="//span[normalize-space()='Dashboard']";

    //Customers pages
    public static String btnAddNewCustomer ="//a[normalize-space()='New Customer']";
    public static String btnImportCustomers ="//a[normalize-space()='Import Customers']";
    public static String btnContacts="//a[contains(@href,'all_contacts')]"; ////a[normalize-space()='Import Customers']/following-sibling::a
    public static String headerCustomerPage="//span[normalize-space()='Customers Summary']";
    public static String inputSearchCustomers="//input[@class='form-control input-sm']"; ////div[@id='DataTables_Table_0_filter']/descendant::input[@type='search'] or //div[@id='DataTables_Table_0_filter']//input

    //Add new customers
    public static String inputCompanyName ="//input[@id='company']";
    public static String inputVatname="//input[@id='vat']";
    public static String inputPhoneName="//input[@id='phonenumber']";
    public static String inputWebsiteName="//input[@id='website']";
    public static String dropdownGroups="//button[@data-id='groups_in[]']";
    public static String inputSearchGroups="//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String dropdownCurrency="//button[@data-id='default_currency']";
    public static String inputSearchCurrency ="//div[@app-field-wrapper='default_currency']//input[@type='search']";
    public static String dropdownDefaultLanguage="//button[@data-id='default_language']";
    public static String optionVietNamLanguage="//span[normalize-space()='Vietnamese']";
    public static String inputAddress="//textarea[@id='address']";
    public static String inputCity =" //input[@id='city']";
    public static String inputState="//input[@id='state']";
    public static String inputZipCode="//input[@id='zip']";
    public static String dropdownCountry="//button[@data-id='country']";
    public static String optionVietNamCountry="//div[@app-field-wrapper='country']//input[@type='search']";
    public static String btnSaveAndCreateContact= "//div[@id='profile-save-section']//button[normalize-space()='Save and create contact']";
    public static String btnSave= "//div[@id='profile-save-section']//button[normalize-space()='Save']";

    //Project list
    public static String headerProject= "//span[normalize-space()='Projects Summary']";
    public static String btnAddNewProject= "//a[normalize-space()='New Project']";
    public static String inputSearchProject= "//div[@id='DataTables_Table_0_filter']//input[@type='search']";

    //Add new project
    public static String headerAddNewProject= "//form[@id='project_form']/descendant::h4[normalize-space()='Add new project']";
    public static String inputNameProject= "//label[normalize-space()='* Project Name']/following-sibling::input[@type='text']"; //input[@id='name']";
    public static String dropdownCustomer="//label[@for='clientid']/following-sibling::div//button[@type='button']";//button[@data-id='clientid']";
    public static String inputSearchCusstomer= "//label[@for='clientid']/following-sibling::div//input[@type='search']";
    public static String checkboxCalculateProgress= "//input[@id='progress_from_tasks']";
    public static String sliderProgress= "//label[contains(text(),'Progress')]/following-sibling::input[@name='progress']";
    public static String dropdownBillingType= "//label[@for='billing_type']/following-sibling::div[contains(@class,'dropdown ')]";
    public static String optionBillingType= "//span[normalize-space()='Project Hours']";
    public static String dropdownStatus= "//label[@for='status']/following-sibling::div[contains(@class,'dropdown ')]";
    public static String optionStatus= "//span[normalize-space()='Finished']";
    public static String inputTotalRate= "//label[@for='project_rate_per_hour']/following-sibling::input[@type='number']";
    public static String inputEstimatedHours= "//input[@id='estimated_hours']";
    public static String dropdownMembers= "//label[normalize-space()='Members']/following-sibling::div/button[@type='button']";
    public static String inputSearchMembers= "//label[normalize-space()='Members']/following-sibling::div//input[@type='search']";
    public static String inputStartDate= "//label[@for='start_date']/following-sibling::div//input[@type='text']";
    public static String inputDealine= "//label[@for='deadline']/following-sibling::div//input[@type='text']";
    public static String inputTags= "//label[@for='tags']/following-sibling::input";
    public static String inputDescription= "//body[@data-id='description']";//cần phải switch sang iframe (hoc bài sau)
    public static String labelSendProject= "//label[normalize-space()='Send project created email']";
    public static String checkboxSendProject= "//label[normalize-space()='Send project created email']/preceding-sibling::input";
    public static String buttonSaveProject="//div[@class='panel-footer text-right']/child::button";


}
