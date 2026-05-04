package com.baicizhan.main.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class DialView extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static String f20010c = "DialView";

    /* renamed from: a, reason: collision with root package name */
    public b f20011a;

    /* renamed from: b, reason: collision with root package name */
    public View[][] f20012b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            DialView.this.g(v11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int row, int col);
    }

    public DialView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.dial_view, (ViewGroup) this, true);
    }

    public void a() {
        for (int i11 = 0; i11 < this.f20012b.length; i11++) {
            int i12 = 0;
            while (true) {
                View[] viewArr = this.f20012b[i11];
                if (i12 < viewArr.length) {
                    viewArr[i12].setSelected(false);
                    i12++;
                }
            }
        }
    }

    public void b(int row, int col) {
        this.f20012b[row][col].setSelected(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.CharSequence r9) {
        /*
            r8 = this;
            java.lang.String r0 = com.baicizhan.main.customview.DialView.f20010c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "clearHighlight="
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            r0 = 0
            r1 = r0
        L18:
            android.view.View[][] r2 = r8.f20012b
            int r2 = r2.length
            if (r1 >= r2) goto La7
            r2 = r0
        L1e:
            android.view.View[][] r3 = r8.f20012b
            r3 = r3[r1]
            int r4 = r3.length
            if (r2 >= r4) goto La3
            r3 = r3[r2]
            android.widget.Button r3 = (android.widget.Button) r3
            java.lang.String r4 = com.baicizhan.main.customview.DialView.f20010c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "butText="
            r5.append(r6)
            java.lang.CharSequence r6 = r3.getText()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            java.lang.String r4 = com.baicizhan.main.customview.DialView.f20010c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "butSelected="
            r5.append(r6)
            boolean r6 = r3.isSelected()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            java.lang.String r4 = com.baicizhan.main.customview.DialView.f20010c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "butEquals="
            r5.append(r6)
            java.lang.CharSequence r6 = r3.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r9.toString()
            boolean r6 = r6.equals(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r4, r5)
            boolean r4 = r3.isSelected()
            if (r4 == 0) goto L9f
            java.lang.CharSequence r4 = r3.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r9.toString()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L9f
            r3.setSelected(r0)
            return
        L9f:
            int r2 = r2 + 1
            goto L1e
        La3:
            int r1 = r1 + 1
            goto L18
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.customview.DialView.c(java.lang.CharSequence):void");
    }

    public String d(int row, int col) {
        return ((Button) this.f20012b[row][col]).getText().toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        super.dispatchTouchEvent(ev2);
        return true;
    }

    public void e(int row, int col) {
        this.f20012b[row][col].setSelected(true);
    }

    public boolean f(int row, int col) {
        return this.f20012b[row][col].isSelected();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.view.View r6) {
        /*
            r5 = this;
            com.baicizhan.main.customview.DialView$b r0 = r5.f20011a
            if (r0 != 0) goto L5
            goto L24
        L5:
            r0 = 0
            r1 = r0
        L7:
            android.view.View[][] r2 = r5.f20012b
            int r2 = r2.length
            if (r1 >= r2) goto L24
            r2 = r0
        Ld:
            android.view.View[][] r3 = r5.f20012b
            r3 = r3[r1]
            int r4 = r3.length
            if (r2 >= r4) goto L21
            r3 = r3[r2]
            if (r3 != r6) goto L1e
            com.baicizhan.main.customview.DialView$b r6 = r5.f20011a
            r6.a(r1, r2)
            return
        L1e:
            int r2 = r2 + 1
            goto Ld
        L21:
            int r1 = r1 + 1
            goto L7
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.customview.DialView.g(android.view.View):void");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f20012b = new View[][]{new View[]{findViewById(R.id.button00), findViewById(R.id.button01), findViewById(R.id.button02)}, new View[]{findViewById(R.id.button10), findViewById(R.id.button11), findViewById(R.id.button12)}, new View[]{findViewById(R.id.button20), findViewById(R.id.button21), findViewById(R.id.button22)}};
        for (int i11 = 0; i11 < this.f20012b.length; i11++) {
            int i12 = 0;
            while (true) {
                View[] viewArr = this.f20012b[i11];
                if (i12 < viewArr.length) {
                    viewArr[i12].setOnClickListener(new a());
                    i12++;
                }
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        return true;
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        super.setClickable(clickable);
        for (int i11 = 0; i11 < this.f20012b.length; i11++) {
            int i12 = 0;
            while (true) {
                View[] viewArr = this.f20012b[i11];
                if (i12 < viewArr.length) {
                    viewArr[i12].setClickable(clickable);
                    i12++;
                }
            }
        }
    }

    public void setDelegate(b delegate) {
        this.f20011a = delegate;
    }

    public void setText(String[] text) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f20012b.length; i12++) {
            int i13 = 0;
            while (true) {
                View[] viewArr = this.f20012b[i12];
                if (i13 < viewArr.length) {
                    Button button = (Button) viewArr[i13];
                    if (i11 < text.length) {
                        button.setText(text[i11]);
                        ((View) button.getParent()).setVisibility(0);
                        i11++;
                    } else {
                        ((View) button.getParent()).setVisibility(8);
                    }
                    i13++;
                }
            }
        }
    }
}
