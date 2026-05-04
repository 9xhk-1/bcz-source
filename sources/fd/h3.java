package fd;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.TextView;
import com.aigestudio.wheelpicker.WheelPicker;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h3 extends Dialog implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final String f51590c = "PublisherSelectionDialog";

    /* renamed from: a, reason: collision with root package name */
    public WheelPicker f51591a;

    /* renamed from: b, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f51592b;

    public h3(Context context) {
        super(context, R.style.bottomDialogStyle);
        View inflate = LayoutInflater.from(context).inflate(R.layout.publisher_selection_dialog, (ViewGroup) null, false);
        this.f51591a = (WheelPicker) inflate.findViewById(R.id.wheel);
        ((TextView) inflate.findViewById(R.id.ok)).setOnClickListener(this);
        inflate.findViewById(R.id.cancel).setOnClickListener(this);
        setContentView(inflate);
    }

    public void a(AdapterView.OnItemSelectedListener listener) {
        this.f51592b = listener;
    }

    public void b(final int currentIndex, List<String> publishers) {
        this.f51591a.setData(publishers);
        this.f51591a.s(currentIndex, false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.ok) {
            if (id2 == R.id.cancel) {
                dismiss();
            }
        } else {
            int currentItemPosition = this.f51591a.getCurrentItemPosition();
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f51592b;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onItemSelected(null, view, currentItemPosition, currentItemPosition);
            }
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
        }
    }
}
