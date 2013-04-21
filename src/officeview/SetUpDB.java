/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package officeview;

import order.util.MongoHelper;
import officeview.OfficeView.School;

/**
 *
 * @author jcooney7722
 */
public class SetUpDB {
    
    public SetUpDB() {}
    
    public static void main(String[] args){
        
        MongoHelper.setDB("officeview");
        
        MongoHelper.getCollection("professors").drop();
        
        Professor professor = new Professor("steve","bluhson",null,null,"steve.bluhson", "bluh", School.LIBERAL_ARTS);
        Professor professor2 = new Professor("ron","coleman",null,null,"ron.coleman", "ronspw",School.COMPUTER_SCIENCE_MATH);
        Professor professor3 = new Professor("alan","labouseur",null,null,"alan.labouseur", "axq1u",School.COMPUTER_SCIENCE_MATH);
        Professor professor4 = new Professor("ben","carle",null,null,"ben.carle", "redE4anything",School.COMPUTER_SCIENCE_MATH);
        Professor professor5 = new Professor("nor","coleman",null,null,"nor.coleman", "teddyBear",School.MANAGEMENT);
        
        MongoHelper.save(professor,"professors");
        MongoHelper.save(professor2,"professors");
        MongoHelper.save(professor3,"professors");
        MongoHelper.save(professor4,"professors");
        MongoHelper.save(professor5,"professors");
    }
}
