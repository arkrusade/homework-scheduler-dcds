/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_scheduler;

/**
 *
 * @author Justin Lee
 */
public class work {
    //TODO add date
    private String classname;
    private int blocknum;
    private String inClass;
    private String outClass;

    public work(String classname, int blocknum) {
        this.classname = classname;
        this.blocknum = blocknum;
    }
    
    public work() {
    }

    public work(String classname) {
        this.classname = classname;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public int getBlocknum() {
        return blocknum;
    }

    public void setBlocknum(int blocknum) {
        this.blocknum = blocknum;
    }

    public String getInClass() {
        return inClass;
    }

    public void setInClass(String inClass) {
        this.inClass = inClass;
    }

    public String getOutClass() {
        return outClass;
    }

    public void setOutClass(String outClass) {
        this.outClass = outClass;
    }

    @Override
    public String toString() {
        return "work{" + "block=" + block + ", classname=" + classname + ", blocknum=" + blocknum + ", inClass=" + inClass + ", outClass=" + outClass + '}';
    }
}
