import com.ooyala.flex.jobexecutor.dto.FlexObjectReference
import com.ooyala.flex.plugins.GroovyScriptContext
import com.ooyala.flex.plugins.actions.service.scripting.lock.ScriptingLockManager
import com.ooyala.flex.sdk.FlexSdkClient

def execute(FlexSdkClient flexSdkClient, GroovyScriptContext context, ScriptingLockManager lockManager,
			List<FlexObjectReference> objectRefs) {

	context.logInfo("SCM Hello World!")

}
