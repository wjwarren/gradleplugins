package org.acme;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: Rene
 * Date: 14.04.2010
 * Time: 21:46:29
 * To change this template use File | Settings | File Templates.
 */
public class CutPojoTest {

    private CutPojo cut = new CutPojo();

    @Test
    public void testSetterGetterProp1(){
        cut.setProp1("prop1");
        assertEquals("prop1", cut.getProp1());
    }
}
