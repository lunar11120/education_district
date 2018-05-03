# OBEC.IFEC JAVA web application

This Software Design Document provides the design details of OBEC education district management.The Office of the Basic Education Commission (OBEC) is a Thai governmental agency, founded in 2003.It is an office of the Thai Ministry of Education (MOE). Its mission is to organize and promote basic education from primary school to high school.

### About my web app

My JAVA web application, OBEC.IFEC, is a web-based thailand education district admin-management portal built using JAVA/MySQL.

![app Preview](https://raw.githubusercontent.com/lunar11120/education_district/master/edu_district/raw_data/gh01_mainpage.jpg )

### Built With

* [Spring Framework](https://spring.io/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [MySQL](https://www.mysql.com/) - Database for this web application
* [Hibernate](http://hibernate.org/) - Object-relational mapping tool 
* [JSP](http://www.oracle.com/technetwork/java/jsp-138432.html) - JavaServer Pages


### Interface design

The interface will use theme light-green color.it easy to use and good understanding of user.

![app Preview](https://raw.githubusercontent.com/lunar11120/education_district/master/edu_district/raw_data/gh02_schoollist.jpg )

### Code Example

A OBEC web application skeleton that uses MVC architectural pattern to create a basic application that contains database management systems and can be used in any web project.


Features

    MVC based application
    MYSQL database connection
    Thai language encoding (UTF-8)


My controller Example.

```
@Controller
@RequestMapping(value="/district")
public class DistrictController {

	@Autowired	
	private DistrictService education_District_Service;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addDistrict(Model model) {
		model.addAttribute("district", new District());
		return "add_district/add_district";
}
```
I use Eclipse IDE tool for build web application.

![app Preview](https://raw.githubusercontent.com/lunar11120/education_district/master/edu_district/raw_data/gh04_eclipse.jpg )

## Author

* **Juckkapun Lertpardungkulchai** - *Java Programmer* - [Linkedin](https://www.linkedin.com/in/juckkapun-lertphadungkulchai-670706127/)



## License and References

This web app is a demonstration project , and used data from main OBEC website(you can find from link below). 

* [OBEC](http://www.obec.go.th/) - official site
* [Thailand/OBEC](https://en.wikipedia.org/wiki/Office_of_the_Basic_Education_Commission) - wikipedia 

