package com.spring.training.test;

import java.util.Iterator;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.spring.training.bean.ComputerBean;
import com.spring.training.bean.CustomerBean;
import com.spring.training.bean.DepartmantBean;
import com.spring.training.bean.EmployeeBean;
import com.spring.training.bean.SchoolBean;
import com.spring.training.bean.ShopBean;
import com.spring.training.bean.TvBean;

public class XmlConfigClassTest {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:application-context.xml")) {

			EmployeeBean employeeBean = (EmployeeBean) context.getBean("employeeBean");
			System.out.println("employeeBean --> " + employeeBean.toString());

			DepartmantBean departmantITBean = (DepartmantBean) context.getBean("departmantITBean");
			System.out.println("departmantITBean --> " + departmantITBean);

			DepartmantBean departmantHRBean = (DepartmantBean) context.getBean("departmantHRBean");
			System.out.println("departmantHRBean --> " + departmantHRBean);

			SchoolBean schoolBean = (SchoolBean) context.getBean("schoolBean");
			System.out.println("schoolBean --> " + schoolBean.toString());

			CustomerBean baseCustomerBean = (CustomerBean) context.getBean("baseCustomerBean");
			System.out.println("baseCustomerBean --> " + baseCustomerBean.toString());

			CustomerBean customerBean = (CustomerBean) context.getBean("customerBean");
			System.out.println("customerBean --> " + customerBean.toString());

			ShopBean shopBean = (ShopBean) context.getBean("shopBean");
			System.out.println("shopBean --> " + shopBean.toString());

			ComputerBean computerBean = (ComputerBean) context.getBean("computerBean");
			System.out.println("computerBean --> " + computerBean.toString());

			TvBean tvBean = (TvBean) context.getBean("tvBean");
			System.out.println("tvBean --> " + tvBean.toString());

			ExpressionParser parser = new SpelExpressionParser();
			Expression exp = parser.parseExpression("'Spring Training'");
			System.out.println(exp.getValue());

			for (Iterator<String> iter = context.getBeanFactory().getBeanNamesIterator(); iter.hasNext();) {
				System.out.println("Spring Bean : " + iter.next());

			}
		}

	}

}
