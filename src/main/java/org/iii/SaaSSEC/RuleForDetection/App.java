package org.iii.SaaSSEC.RuleForDetection;

import org.iii.SaaSSEC.function.ElasticsearchTool;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		ElasticsearchTool es = new ElasticsearchTool();
		es.setElasticsearchClinent();
		
		System.out.println("Hello World!");
	}
	
}
