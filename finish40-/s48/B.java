package s48;
import java.io.ByteArrayInputStream;
import java.util.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class B {
	public static void main(String[] args) throws Exception{
		StringBuilder str = new StringBuilder();
		for(Scanner s = new Scanner(System.in);s.hasNext();){
			str.append(s.next());
		}
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser parser = spf.newSAXParser();
		Handler hd = new Handler();
		parser.parse(new ByteArrayInputStream(str.toString().replaceAll("\\s", "").getBytes()), hd);
		Collections.sort(hd.result);
		System.out.println(hd.result.toString().replaceAll("[\\[\\],]", ""));
	}

	static class Handler extends DefaultHandler {
		List<Integer> result = new ArrayList<Integer>();
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			if(qName.equals("table")){
				q.push(0);
			}else if(qName.endsWith("td")){
				q.push(q.poll()+1);
			}
		}
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			if(qName.equals("table")){
				result.add(q.poll());
			}
		}
	}
}
