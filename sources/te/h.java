package te;

import android.widget.CompoundButton;
import androidx.databinding.BindingAdapter;
import androidx.databinding.InverseBindingAdapter;
import androidx.databinding.InverseBindingListener;
import com.kyleduo.switchbutton.SwitchButton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90482a = "SwtichButtonBindingUtils";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InverseBindingListener f90483a;

        public a(final InverseBindingListener val$listener) {
            this.f90483a = val$listener;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            this.f90483a.onChange();
        }
    }

    @BindingAdapter(requireAll = false, value = {"onCheckedChanged"})
    public static void a(SwitchButton input, final InverseBindingListener listener) {
        if (listener == null) {
            qb.c.d(f90482a, "InverseBindingListener null!", new Object[0]);
        } else {
            qb.c.b(f90482a, "setRefreshingAttrChanged", new Object[0]);
            input.setOnCheckedChangeListener(new a(listener));
        }
    }

    @BindingAdapter(requireAll = false, value = {"bindChecked"})
    public static void b(SwitchButton view, Boolean open) {
        boolean booleanValue = open == null ? false : open.booleanValue();
        if (view.isChecked() == booleanValue) {
            return;
        }
        view.setChecked(booleanValue);
    }

    @InverseBindingAdapter(attribute = "bindChecked", event = "onCheckedChanged")
    public static boolean c(SwitchButton view) {
        return view.isChecked();
    }
}
