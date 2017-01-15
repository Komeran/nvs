package at.spengergasse;


import java.sql.Date;

public class Product {
    /*
| Key | name | type
| --|--
| PK | Product_uid | Integer
| PK | Product_series | Integer
| PK | Product_category | Integer
| PK | Insurance_plan | Integer
|| Name | Varchar(255)
|| product_activation_date | date
|| iteration | Integer
|| insurance_years | integer
|| insurance_details | varchar(4095)
|| products_sold | integer
|| price | decimal (7,2)
|| activated | boolean
|| repairs | integer
     */

    private int productUid;
    private int productSeries;
    private int productCategory;
    private int insurancePlan;
    private String name;
    private String date;
    private int iteration;
    private int insuranceYears;
    private String insuranceDetaails;
    private int productsSold;
    private double price;
    private boolean activated;
    private int repairs;

    public Product(int uid, int series) {
        set_product_uid(uid);
        set_product_series(series);
        set_product_category();
        set_insurance_plan();
        set_name();
        set_date();
        set_iteration();
        set_insurance_years();
        set_insurance_details();
        set_products_sold();
        set_price();
        set_activated();
        set_repairs();
    }


    public void set_product_uid(int productUid) {
        this.productUid = productUid;
    }
    public void set_product_series(int productSeries) {

        this.productSeries = productSeries / 4;
    }
    public void set_product_category() {
        this.productCategory =  Math.round(Math.round(Math.random()* 4));
    }
    public void set_insurance_plan() {
        this.insurancePlan = Math.round(Math.round(Math.random()* 3));
    }
    public void set_name() {
        this.name =  "Sample Product";
    }

    public void set_date() {

        this.date =  new Date(1,1,1).toString();
    }
    public void set_iteration() {
        this.iteration = Math.round(Math.round(Math.random()* 20));
    }
    public void set_insurance_years() {
        this.insuranceYears = Math.round(Math.round(Math.random()* 20));
    }
    public void set_insurance_details() {
        this.insuranceDetaails =  "Sample Insurance";
    }
    public void set_products_sold() {
        this.productsSold =  Math.round(Math.round(Math.random()* 2000));
    }
    public void set_price() {
        this.price =  Math.round(Math.random()* 5000);
    }
    public void set_activated() {
        this.activated =  Math.random() > 0.5;
    }
    public void set_repairs() {
        this.repairs =  Math.round(Math.round(Math.random()* 10));
    }

    public static String getCSVHEADER() {
            /*
| Key | name | type
| --|--
| PK | Product_uid | Integer
| PK | Product_series | Integer
| PK | Product_category | Integer
| PK | Insurance_plan | Integer
|| Name | Varchar(255)
|| product_activation_date | date
|| iteration | Integer
|| insurance_years | integer
|| insurance_details | varchar(4095)
|| products_sold | integer
|| price | decimal (7,2)
|| activated | boolean
|| repairs | integer
     */
            return  "PRODUCT_UID,PRODUCT_SERIES,PRODUCT_CATEGORY,INSURANCE_PLAN,NAME,ACTIVATION_DATE,ITERATION,INSURANCE_YEARS,INSURANCE_DETAILS,PRODUICT_SOLD,PRICE,ACTIVATED,REPAIRS";
    }
    public String getCSVLine() {
     return new StringBuilder()
             .append(productUid)
             .append(",")
             .append(productSeries)
             .append(",")
             .append(productCategory)
             .append(",")
             .append(insurancePlan)
             .append(",")
             .append(name)
             .append(",")
             .append(date)
             .append(",")
             .append(iteration)
             .append(",")
             .append(insuranceYears)
             .append(",")
             .append(insuranceDetaails)
             .append(",")
             .append(productsSold)
             .append(",")
             .append(price)
             .append(",")
             .append(activated)
             .append(",")
             .append(repairs).toString();
    }
}
