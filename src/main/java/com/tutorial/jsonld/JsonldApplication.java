package com.tutorial.jsonld;

import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.utils.JsonUtils;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonldApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonldApplication.class, args);

		compact("file.json");
	}
        
        /**
         * For this example, the file is located at resources directory
         * @param fileName
         */
	public static void compact(String fileName){
            
            //Get the ClassLoader
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            
            // Load JSON-LD file from resources directory
            InputStream inputStream = cl.getResourceAsStream(fileName);
            
            // Create instance of JsonLdSerialisator Class
            JsonLdSerialisator jsonLdSerialisator = new JsonLdSerialisator();
            
            try {
                // Try to get Compacted JSON-LD document object
                Object compact = jsonLdSerialisator.compact(inputStream);
                
                // Print compacted JSON-LD as pretty Json
                System.out.println(JsonUtils.toPrettyString(compact));
                
            } catch (IOException ex) {
                
                System.out.println("The file doesn't exists");
                
            } catch (JsonLdError ex) {
                
                System.out.println("The Json document is not well formatted");
                
            }

        }

}
