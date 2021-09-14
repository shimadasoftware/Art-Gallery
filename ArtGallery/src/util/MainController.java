package util;

import util.Exceptions;

/**
 *
 * @author andresforero
 */
public abstract class MainController {
    
    //Attributes
    protected Object[] data;
    
    //Constructor
    public MainController(){
        data = new Object[0];
    }
    
    //Setters and Getters
    public Object[] getData() {
        return data;
    }
    
    
    //Abstract Methods
    public abstract boolean create(String[] args, Object[] objs);
    protected abstract boolean isEqual(Object obj, String text);
    
    //Methods
    protected boolean addObject(Object newObject){
        try {
             Object[] tempArray= new Object[this.data.length+1];
            for (int i = 0; i <this.data.length; i++) {
                tempArray[i]=this.data[i];
            }
            tempArray[tempArray.length-1]= newObject;
            data=tempArray;
            
            return true;
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(Exceptions.ARRAY_INDEX_OUT_OF_BOUNDS + e.getMessage());
            return false;
        
        } catch (NullPointerException e) {
            System.err.println(Exceptions.NULL_POINTER + e.getMessage());
            return false;
        }
   
        
    }
    
    protected Object[] addFilteredObject(Object newObject, Object[] array){
        try {
             Object[] tempArray= new Object[array.length+1];
            for (int i = 0; i <array.length; i++) {
                tempArray[i]=array[i];
            }
            tempArray[tempArray.length-1]= newObject;
            array=tempArray;
            
            return array;
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(Exceptions.ARRAY_INDEX_OUT_OF_BOUNDS + e.getMessage());
            return null;
        
        } catch (NullPointerException e) {
            System.err.println(Exceptions.NULL_POINTER + e.getMessage());
            return null;
        }
   
        
    }
    
    public Object getObjectByIndex(int index){
        return data[index];
    }
    
    //Remove by index
    public boolean removeByIndex(int index){
        try {

            if((data.length - 1) != index){
                //Gets old data
                Object lastObject = data[data.length - 1];
                Object indexObject = data[index];

                //Sets new Data
                data[index] = lastObject;
                data[data.length - 1] = indexObject; 
            }

            removeLastObject();
            
            return true;
        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(Exceptions.ARRAY_INDEX_OUT_OF_BOUNDS + e.getMessage());
            return false;
        }
    }
    
    //Remove last object
    public boolean removeLastObject(){
        Object[] tempArray = new Object[data.length - 1];
        for(int i=0; i< data.length - 1; i++){
            tempArray[i] = data[i];
        }
        data = tempArray;
        
        return true;
    }
    
    //Order array by index
    public void sortData(){
        data = BubbleSort.bubble_srt(data);
    }
    
    public String list(){
        StringBuilder dataText = new StringBuilder();
        for(Object current : data){
            dataText.append(current.toString());
            dataText.append("\n");
        }
        
        return dataText.toString();
    }
    
    public Object[] findAll(String text){
        Object[] filteredData = new Object[0];
        for (Object object : data) {
            if(isEqual(object, text)){
                filteredData = addFilteredObject(object, filteredData);
            }
        }
        
        return filteredData;
    }
    
}
