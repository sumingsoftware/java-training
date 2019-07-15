package com.chinasofti.page53;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jParser {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SAXReader reader = null;
		
		try {
			reader = new SAXReader(new DocumentFactory());
			Document doc = reader.read("pets.xml");
			Element rootEle = doc.getRootElement();
			
			List<Element> dogList = rootEle.selectNodes("./dog");
			List<Element> penguinList = rootEle.selectNodes("./penguin");
			
			print(dogList);
			
			print(penguinList);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	private static void print(List<Element> list) {
		for(Element ele : list)
		{
			Element healthEle = (Element)ele.selectSingleNode("./health");
			Element loveEle = (Element)ele.selectSingleNode("./love");
			Element decHealthEle = (Element)ele.selectSingleNode("./decHealth");
			Element incLoveEle = (Element)ele.selectSingleNode("./incLove");
			System.out.println("health is: " + healthEle.getText() + ", love is: " + loveEle.getText()
			+ ", decHealth is: " + decHealthEle.getText() + ", incLove is: " + incLoveEle.getText());
		}
	}
    
    
}
