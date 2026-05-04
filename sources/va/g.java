package va;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.Toast;
import com.baicizhan.online.structs.BELogicException;
import com.baicizhan.online.thrift.basic.LogicException;
import com.jiongji.andriod.card.R;
import gs.r4;
import java.net.UnknownHostException;
import org.apache.thrift.transport.TTransportException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {
    public static void a(Context context, Toast toast, String text) {
        r4 d11 = r4.d(LayoutInflater.from(context));
        d11.f56571a.setText(text);
        toast.setView(d11.getRoot());
    }

    public static void b(Toast toast, String text) {
        r4 d11 = r4.d(LayoutInflater.from(pb.a.a()));
        d11.f56571a.setText(text);
        toast.setView(d11.getRoot());
    }

    public static String c() {
        return e(null, R.string.base_toast_failed);
    }

    public static String d(Throwable t11) {
        return e(t11, R.string.base_toast_failed);
    }

    public static String e(Throwable t11, int res) {
        String f11 = f(t11);
        if (TextUtils.isEmpty(f11) && t11 != null && t11.getCause() != null) {
            f11 = f(t11.getCause());
        }
        return TextUtils.isEmpty(f11) ? pb.a.a().getString(res) : f11;
    }

    public static String f(Throwable e11) {
        if (e11 == null) {
            return null;
        }
        while (e11 != null) {
            if ((e11 instanceof BELogicException) || (e11 instanceof LogicException)) {
                return e11.getMessage();
            }
            if ((e11 instanceof TTransportException) || (e11 instanceof UnknownHostException)) {
                return pb.a.a().getString(R.string.base_toast_no_network);
            }
            e11 = e11.getCause();
        }
        return null;
    }

    public static void g(int strRes, int duration) {
        Toast makeText = Toast.makeText(pb.a.a(), strRes, duration);
        b(makeText, pb.a.a().getString(strRes));
        makeText.show();
    }

    public static void h(Context context, String message, int duration) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        a(context, toast, message);
        toast.show();
    }

    public static void i(String text, int duration) {
        Toast makeText = Toast.makeText(pb.a.a(), text, duration);
        b(makeText, text);
        makeText.show();
    }

    public static void j(Throwable e11, int duration) {
        Toast toast = new Toast(pb.a.a());
        toast.setDuration(duration);
        b(toast, d(e11));
        toast.show();
    }

    public static void k(Throwable e11, int res, int duration) {
        Toast toast = new Toast(pb.a.a());
        toast.setDuration(duration);
        b(toast, e(e11, res));
        toast.show();
    }
}
