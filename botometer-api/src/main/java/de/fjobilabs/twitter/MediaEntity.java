/*
 * Copyright 2019 FJOBI Labs Softwareentwicklung - Felix Jordan
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.fjobilabs.twitter;

/**
 * @since 0.1.0
 * @author Felix Jordan
 */
public interface MediaEntity extends Entity {
    
    @Override
    int getStartIndex();
    
    @Override
    int getEndIndex();
    
    /**
     * Returns the media URL text. This is the same value as {@link #getURL()}.
     *
     * @return The media URL text.
     */
    @Override
    String getText();
    
    String getDisplayURL();
    
    String getExpandedURL();
    
    long getId();
    
    String getMediaURL();
    
    String getMediaURLHttps();
    
    Sizes getSizes();
    
    long getSourceStatusId();
    
    String getType();
    
    String getURL();
    
    /**
     * @since 0.1.0
     * @author Felix Jordan
     */
    interface Sizes {
        
        Size getThumb();
        
        Size getLarge();
        
        Size getMedium();
        
        Size getSmall();
        
        /**
         * @since 0.1.0
         * @author Felix Jordan
         */
        interface Size {
            
            int getWidth();
            
            int getHeight();
            
            String getResize();
        }
    }
}
