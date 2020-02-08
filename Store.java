/**
 * @author Jacob Gualtieri
 * @date 2/8/2020
 * Representation of a Wegmans Grocery Store
 */
package App_Model;

public class Store {
    // Store Attributes
    private int number;
    private String name;
    private String type;
    private Object address;

    /**
     * Creates an instance of the Store class
     * @param store_number The unique number assigned to a wegmans grocery store
     * @param store_name The name of a wegmans branch
     * @param store_type The type of wegmans branch
     * @param store_address The address of the wegmans branch
     */
    public Store(int store_number, String store_name, String store_type, Object store_address){
        this.number = store_number;
        this.name = store_name;
        this.type = store_type;
        this.address = store_address;
    }

    public int getStoreNumber(){ return this.number; }

    public String getName(){ return this.name; }

    public String getType(){ return this.type; }

    public Object getAddress(){ return this.address; }
}
