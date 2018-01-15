/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.jsonld;

import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class JsonLdSerialisator {
    
    public Object compact(InputStream inputStream) throws IOException, JsonLdError{
                
        Object jsonObject = JsonUtils.fromInputStream(inputStream);
        
        Map context = new HashMap();     
        
        JsonLdOptions options = new JsonLdOptions();
        
        Object compact = JsonLdProcessor.compact(jsonObject, context, options);
        
        return compact;
    }
}
