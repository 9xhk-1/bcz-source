package com.tencent.liteav.videodecoder;

import android.util.Log;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f44255a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44256b = false;

    private void a(String str, byte[] bArr) {
        if (!this.f44255a || bArr == null) {
            return;
        }
        String str2 = "";
        for (int i11 = 0; i11 < bArr.length && i11 < 256; i11++) {
            String hexString = Integer.toHexString(bArr[i11] & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            str2 = str2 + " " + hexString;
        }
        Log.d("[H264SPSModifier]", str + str2);
    }

    private byte[] b(byte[] bArr) {
        byte b11;
        byte[] bArr2 = new byte[bArr.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            if (i11 < bArr.length - 3 && (b11 = bArr[i11]) == 0) {
                int i13 = i11 + 1;
                if (bArr[i13] == 0 && bArr[i11 + 2] == 3) {
                    int i14 = i11 + 3;
                    if (bArr[i14] <= 3) {
                        int i15 = i12 + 1;
                        bArr2[i12] = b11;
                        i12 += 2;
                        bArr2[i15] = bArr[i13];
                        i11 = i14;
                    }
                }
            }
            bArr2[i12] = bArr[i11];
            i11++;
            i12++;
        }
        if (i12 == bArr.length) {
            return null;
        }
        byte[] bArr3 = new byte[i12];
        System.arraycopy(bArr2, 0, bArr3, 0, i12);
        return bArr3;
    }

    private byte[] c(byte[] bArr) {
        byte b11;
        byte[] bArr2 = new byte[(bArr.length * 3) / 2];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            if (i11 < bArr.length - 2 && (b11 = bArr[i11]) == 0) {
                int i13 = i11 + 1;
                if (bArr[i13] == 0) {
                    int i14 = i11 + 2;
                    if (bArr[i14] <= 3) {
                        bArr2[i12] = b11;
                        int i15 = i12 + 2;
                        bArr2[i12 + 1] = bArr[i13];
                        i12 += 3;
                        bArr2[i15] = 3;
                        i11 = i14;
                    }
                }
            }
            bArr2[i12] = bArr[i11];
            i11++;
            i12++;
        }
        if (i12 == bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[i12];
        System.arraycopy(bArr2, 0, bArr3, 0, i12);
        return bArr3;
    }

    public byte[] a(byte[] bArr) throws IOException {
        boolean z11;
        a("origin sps : ", bArr);
        byte[] b11 = b(bArr);
        if (b11 != null) {
            a("deEmulationPrevention sps : ", b11);
            z11 = true;
            bArr = b11;
        } else {
            z11 = false;
        }
        byte[] a11 = a(new ByteArrayInputStream(bArr));
        a("new sps : ", a11);
        if (a11 == null || !z11) {
            return a11;
        }
        byte[] c11 = c(a11);
        a("emulationPrevention sps : ", c11);
        return c11;
    }

    private boolean b(c cVar) throws IOException {
        if (cVar.d("VUI: aspect_ratio_info_present_flag") && ((int) cVar.a(8, "VUI: aspect_ratio")) == 255) {
            cVar.b(16, "VUI: sar_width");
            cVar.b(16, "VUI: sar_height");
        }
        if (cVar.d("VUI: overscan_info_present_flag")) {
            cVar.b(1, "VUI: overscan_appropriate_flag");
        }
        if (cVar.d("VUI: video_signal_type_present_flag")) {
            cVar.b(3, "VUI: video_format");
            cVar.b(1, "VUI: video_full_range_flag");
            if (cVar.d("VUI: colour_description_present_flag")) {
                cVar.b(8, "VUI: colour_primaries");
                cVar.b(8, "VUI: transfer_characteristics");
                cVar.b(8, "VUI: matrix_coefficients");
            }
        }
        if (cVar.d("VUI: chroma_loc_info_present_flag")) {
            cVar.b("VUI chroma_sample_loc_type_top_field");
            cVar.b("VUI chroma_sample_loc_type_bottom_field");
        }
        if (cVar.d("VUI: timing_info_present_flag")) {
            cVar.b(32, "VUI: num_units_in_tick");
            cVar.b(32, "VUI: time_scale");
            cVar.b(1, "VUI: fixed_frame_rate_flag");
        }
        boolean d11 = cVar.d("VUI: nal_hrd_parameters_present_flag");
        if (d11) {
            a(cVar);
        }
        boolean d12 = cVar.d("VUI: vcl_hrd_parameters_present_flag");
        if (d12) {
            a(cVar);
        }
        if (d11 || d12) {
            cVar.b(1, "VUI: low_delay_hrd_flag");
        }
        cVar.b(1, "VUI: pic_struct_present_flag");
        if (cVar.e("VUI: bitstream_restriction_flag")) {
            if (this.f44255a) {
                Log.d("[H264SPSModifier]", "steve:VUI has bs restriction!!");
            }
            cVar.a(true, "VUI: set bitstream_restriction_flag");
            cVar.d("VUI: motion_vectors_over_pic_boundaries_flag");
            cVar.b("VUI max_bytes_per_pic_denom");
            cVar.b("VUI max_bits_per_mb_denom");
            cVar.b("VUI log2_max_mv_length_horizontal");
            cVar.b("VUI log2_max_mv_length_vertical");
            cVar.b("VUI num_reorder_frames");
            if (!this.f44256b) {
                TXCLog.w("[H264SPSModifier]", "decode: do not add max_dec_frame_buffering when it is " + cVar.c(false));
                this.f44256b = true;
            }
            return false;
        }
        if (this.f44255a) {
            Log.d("[H264SPSModifier]", "steve:VUI has NO bs restriction!!");
        }
        cVar.a(true, "VUI: set bitstream_restriction_flag");
        cVar.a(true, "VUI: motion_vectors_over_pic_boundaries_flag");
        cVar.c(0, "VUI: max_bytes_per_pic_denom");
        cVar.c(0, "VUI: max_bits_per_mb_denom");
        cVar.c(10, "VUI: log2_max_mv_length_horizontal");
        cVar.c(10, "VUI: log2_max_mv_length_vertical");
        cVar.c(0, "VUI: num_reorder_frames");
        cVar.c(1, "VUI: max_dec_frame_buffering");
        if (!this.f44256b) {
            TXCLog.w("[H264SPSModifier]", "decode: add max_dec_frame_buffering 1 when it is no exist");
            this.f44256b = true;
        }
        return true;
    }

    public byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c cVar = new c(inputStream, byteArrayOutputStream);
        cVar.b(8, "NALU type");
        int a11 = (int) cVar.a(8, "SPS: profile_idc");
        cVar.b(8, "SPS: constraint_set_0-3_flag and reserved_zero_4bits");
        cVar.a(8, "SPS: level_idc");
        cVar.b("SPS: seq_parameter_set_id");
        if (a11 == 100 || a11 == 110 || a11 == 122 || a11 == 144) {
            if (cVar.a("SPS: chroma_format_idc") == 3) {
                cVar.b(1, "SPS: residual_color_transform_flag");
            }
            cVar.b("SPS: bit_depth_luma_minus8");
            cVar.b("SPS: bit_depth_chroma_minus8");
            cVar.b(1, "SPS: qpprime_y_zero_transform_bypass_flag");
            if (cVar.d("SPS: seq_scaling_matrix_present_lag")) {
                for (int i11 = 0; i11 < 8; i11++) {
                    if (cVar.d("SPS: seqScalingListPresentFlag")) {
                        if (i11 < 6) {
                            cVar.c(16);
                        } else {
                            cVar.c(64);
                        }
                    }
                }
            }
        }
        cVar.b("SPS: log2_max_frame_num_minus4");
        int a12 = cVar.a("SPS: pic_order_cnt_type");
        if (a12 == 0) {
            cVar.b("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (a12 == 1) {
            cVar.b(1, "SPS: delta_pic_order_always_zero_flag");
            cVar.b("SPS: offset_for_non_ref_pic");
            cVar.b("SPS: offset_for_top_to_bottom_field");
            int a13 = cVar.a("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i12 = 0; i12 < a13; i12++) {
                cVar.b("SPS: offsetForRefFrame [" + i12 + "]");
            }
        }
        int a14 = cVar.a("SPS: num_ref_frames");
        if (this.f44255a) {
            Log.d("[H264SPSModifier]", "SPS: num_ref_frames: " + a14);
        }
        cVar.b(1, "SPS: gaps_in_frame_num_value_allowed_flag");
        cVar.b("SPS: pic_width_in_mbs_minus1");
        cVar.b("SPS: pic_height_in_map_units_minus1");
        if (!cVar.d("SPS: frame_mbs_only_flag")) {
            cVar.b(1, "SPS: mb_adaptive_frame_field_flag");
        }
        cVar.b(1, "SPS: direct_8x8_inference_flag");
        if (cVar.d("SPS: frame_cropping_flag")) {
            cVar.b("SPS: frame_crop_left_offset");
            cVar.b("SPS: frame_crop_right_offset");
            cVar.b("SPS: frame_crop_top_offset");
            cVar.b("SPS: frame_crop_bottom_offset");
        }
        if (cVar.e("SPS: vui_parameters_present_flag")) {
            if (this.f44255a) {
                Log.d("[H264SPSModifier]", "vui_parameters_present_flag exist!! modify max_dec_frame_buffering");
            }
            cVar.a(true, "VUI set 1: ");
            if (!b(cVar)) {
                return null;
            }
        } else {
            if (this.f44255a) {
                Log.d("[H264SPSModifier]", "vui_parameters_present_flag NOT exist!! add max_dec_frame_buffering");
            }
            cVar.a(true, "VUI set 1: ");
            cVar.a(false, "VUI: aspect_ratio_info_present_flag");
            cVar.a(false, "VUI: overscan_info_present_flag");
            cVar.a(false, "VUI: video_signal_type_present_flag");
            cVar.a(false, "VUI: chroma_loc_info_present_flag");
            cVar.a(false, "VUI: timing_info_present_flag");
            cVar.a(false, "VUI: nal_hrd_parameters_present_flag");
            cVar.a(false, "VUI: vcl_hrd_parameters_present_flag");
            cVar.a(false, "VUI: pic_struct_present_flag");
            cVar.a(true, "VUI: bitstream_restriction_flag");
            cVar.a(true, "VUI: motion_vectors_over_pic_boundaries_flag");
            cVar.c(0, "VUI: max_bytes_per_pic_denom");
            cVar.c(0, "VUI: max_bits_per_mb_denom");
            cVar.c(10, "VUI: log2_max_mv_length_horizontal");
            cVar.c(10, "VUI: log2_max_mv_length_vertical");
            cVar.c(0, "VUI: num_reorder_frames");
            cVar.c(1, "VUI: max_dec_frame_buffering");
            if (!this.f44256b) {
                TXCLog.w("[H264SPSModifier]", "decode: add max_dec_frame_buffering 1 when vui is no exist");
                this.f44256b = true;
            }
        }
        cVar.c();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (this.f44255a) {
            String str = "";
            for (byte b11 : byteArray) {
                String hexString = Integer.toHexString(b11 & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                str = str + " " + hexString;
            }
            Log.d("[H264SPSModifier]", "new SPS:" + str);
        }
        return byteArray;
    }

    private void a(c cVar) throws IOException {
        int a11 = cVar.a("SPS: cpb_cnt_minus1");
        cVar.b(4, "HRD: bit_rate_scale");
        cVar.b(4, "HRD: cpb_size_scale");
        for (int i11 = 0; i11 <= a11; i11++) {
            cVar.b("HRD: bit_rate_value_minus1");
            cVar.b("HRD: cpb_size_value_minus1");
            cVar.b(1, "HRD: cbr_flag");
        }
        cVar.b(5, "HRD: initial_cpb_removal_delay_length_minus1");
        cVar.b(5, "HRD: cpb_removal_delay_length_minus1");
        cVar.b(5, "HRD: dpb_output_delay_length_minus1");
        cVar.b(5, "HRD: time_offset_length");
    }
}
