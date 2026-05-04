package va;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.NumberPicker;
import androidx.annotation.NonNull;
import com.jiongji.andriod.card.R;
import gs.i4;
import java.lang.reflect.Field;
import java.util.Calendar;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class j extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public i4 f93767a;

    /* renamed from: b, reason: collision with root package name */
    public d f93768b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            j.this.dismiss();
            if (j.this.f93768b != null) {
                j.this.f93768b.a(j.this.f93767a.f55271d.getYear(), j.this.f93767a.f55271d.getMonth(), j.this.f93767a.f55271d.getDayOfMonth());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            j.this.dismiss();
            if (j.this.f93768b != null) {
                j.this.f93768b.cancel();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: g, reason: collision with root package name */
        public static final int f93771g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f93772h = 2;

        /* renamed from: a, reason: collision with root package name */
        public d f93773a;

        /* renamed from: b, reason: collision with root package name */
        public int f93774b = 1;

        /* renamed from: c, reason: collision with root package name */
        public long f93775c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f93776d = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f93778f = 0;

        /* renamed from: e, reason: collision with root package name */
        public long f93777e = System.currentTimeMillis();

        public static void b(DatePicker datePicker) {
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("day", "id", "android");
            int identifier2 = system.getIdentifier(n.r.f98260b, "id", "android");
            int identifier3 = system.getIdentifier(n.r.f98259a, "id", "android");
            NumberPicker numberPicker = (NumberPicker) datePicker.findViewById(identifier);
            NumberPicker numberPicker2 = (NumberPicker) datePicker.findViewById(identifier2);
            NumberPicker numberPicker3 = (NumberPicker) datePicker.findViewById(identifier3);
            c(numberPicker);
            c(numberPicker2);
            c(numberPicker3);
        }

        public static void c(NumberPicker picker) {
            if (picker == null) {
                return;
            }
            int childCount = picker.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                try {
                    Field declaredField = picker.getClass().getDeclaredField("mSelectionDivider");
                    declaredField.setAccessible(true);
                    declaredField.set(picker, new ColorDrawable(picker.getResources().getColor(R.color.login_bg_blue)));
                    picker.invalidate();
                } catch (Exception e11) {
                    qb.c.p("setDividerColor", "", e11);
                }
            }
        }

        public Dialog a(Context context) {
            j jVar = new j(context, this.f93773a);
            try {
                if (this.f93774b == 2) {
                    ((ViewGroup) ((ViewGroup) jVar.f93767a.f55271d.getChildAt(0)).getChildAt(0)).getChildAt(1).setVisibility(8);
                    ((ViewGroup) ((ViewGroup) jVar.f93767a.f55271d.getChildAt(0)).getChildAt(0)).getChildAt(2).setVisibility(8);
                }
                if (this.f93775c != -1) {
                    jVar.f93767a.f55271d.setMaxDate(this.f93775c);
                }
                if (this.f93776d != -1) {
                    jVar.f93767a.f55271d.setMinDate(this.f93776d);
                }
                if (this.f93778f != 0) {
                    jVar.f93767a.f55271d.init(this.f93778f, 0, 1, null);
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(this.f93777e);
                    jVar.f93767a.f55271d.init(calendar.get(1), calendar.get(2), calendar.get(5), null);
                }
                b(jVar.f93767a.f55271d);
                jVar.f93767a.f55271d.setDescendantFocusability(393216);
                return jVar;
            } catch (Exception unused) {
                qb.c.d("", "", new Object[0]);
                return jVar;
            }
        }

        public c d(d listener) {
            this.f93773a = listener;
            return this;
        }

        public c e(long max) {
            this.f93775c = max;
            return this;
        }

        public c f(long min) {
            this.f93776d = min;
            return this;
        }

        public c g(long time) {
            this.f93777e = time;
            return this;
        }

        public c h(int type) {
            this.f93774b = type;
            return this;
        }

        public c i(int year) {
            this.f93778f = year;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(int y11, int m11, int d11);

        void cancel();
    }

    public j(@NonNull Context context, d listener) {
        super(context, R.style.bczDatePickup);
        this.f93768b = listener;
        i4 d11 = i4.d(getLayoutInflater());
        this.f93767a = d11;
        d11.f55270c.setOnClickListener(new a());
        this.f93767a.f55269b.setOnClickListener(new b());
        setContentView(this.f93767a.getRoot());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e11) {
            qb.c.c("DatePickupDialog", "", e11);
        }
    }
}
