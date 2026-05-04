package ja0;

import ba0.h4;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestExecutionResult;
import org.opentest4j.TestAbortedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.2", status = API.Status.DEPRECATED)
@Deprecated
/* loaded from: classes9.dex */
public class r1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface a {
        void execute() throws TestAbortedException, Throwable;
    }

    public TestExecutionResult a(a executable) {
        try {
            executable.execute();
            return TestExecutionResult.e();
        } catch (TestAbortedException e11) {
            return TestExecutionResult.a(e11);
        } catch (Throwable th2) {
            h4.a(th2);
            return TestExecutionResult.b(th2);
        }
    }
}
