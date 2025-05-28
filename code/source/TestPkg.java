

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class TestPkg

{
	// ---( internal utility methods )---

	final static TestPkg _instance = new TestPkg();

	static TestPkg _newInstance() { return new TestPkg(); }

	static TestPkg _cast(Object o) { return (TestPkg)o; }

	// ---( server methods )---




	public static final void callGreetMethod (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(callGreetMethod)>> ---
		// @sigtype java 3.5
		// pipeline
				IDataCursor pipelineCursor = pipeline.getCursor();
		try {
		    String name = (String) IDataUtil.get(pipelineCursor, "name");
		
		    String result = com.mycompany.utils.SampleUtils.greet(name);
		
		    IDataUtil.put(pipelineCursor, "greeting", result);
		} catch (Exception e) {
		    throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}
}

