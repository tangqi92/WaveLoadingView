package me.itangqi.waveloadingview;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.larswerkman.lobsterpicker.OnColorListener;
import com.larswerkman.lobsterpicker.sliders.LobsterShadeSlider;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;

public class MainActivity extends AppCompatActivity {

    private WaveLoadingView mWaveLoadingView;
    private int checkedItem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWaveLoadingView = (WaveLoadingView) findViewById(R.id.waveLoadingView);
        // Sets the length of the animation, default is 1000.
        mWaveLoadingView.setAnimDuration(3000);

        // Shape Type
        findViewById(R.id.tv_shape).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new AlertDialog.Builder(MainActivity.this).setTitle("Shape Type").setSingleChoiceItems(
                        new String[] { "CIRCLE", "TRIANGLE", "SQUARE", "RECTANGLE" }, checkedItem,
              new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        checkedItem = which;
                        switch (which) {
                            case 0:
                                mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.CIRCLE);
                                dialog.dismiss();
                                break;
                            case 1:
                                mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.TRIANGLE);
                                dialog.dismiss();
                                break;
                            case 2:
                                mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.SQUARE);
                                dialog.dismiss();
                                break;
                            case 3:
                                mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.RECTANGLE);
                                dialog.dismiss();
                                break;
                            default:
                                dialog.dismiss();
                                break;
                        }
                    }
              }).show();
            }
        });

        // Animator
        ((CheckBox) findViewById(R.id.cb_animator_cancel_and_start)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mWaveLoadingView.cancelAnimation();
                } else {
                    mWaveLoadingView.startAnimation();
                }
            }
        });

        ((CheckBox) findViewById(R.id.cb_animator_pause_and_resume)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mWaveLoadingView.pauseAnimation();
                } else {
                    mWaveLoadingView.resumeAnimation();
                }
            }
        });

        // Top Title
        ((CheckBox) findViewById(R.id.cb_title_top)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mWaveLoadingView.setTopTitle("Top Title");
                } else {
                    mWaveLoadingView.setTopTitle("");
                }
            }
        });
        // Center Title
        ((CheckBox) findViewById(R.id.cb_title_center)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mWaveLoadingView.setCenterTitle("Center Title");
                } else {
                    mWaveLoadingView.setCenterTitle("");
                }
            }
        });
        // Bottom Title
        ((CheckBox) findViewById(R.id.cb_title_bottom)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mWaveLoadingView.setBottomTitle("Bottom Title");
                } else {
                    mWaveLoadingView.setBottomTitle("");
                }
            }
        });

        // Progress
        ((DiscreteSeekBar) findViewById(R.id.seekbar_progress)).setOnProgressChangeListener(new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                mWaveLoadingView.setProgressValue(value);
            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar seekBar) {

            }
        });

        // Border
        ((DiscreteSeekBar) findViewById(R.id.seekbar_border_width)).setOnProgressChangeListener(new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                mWaveLoadingView.setBorderWidth(value);
            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar seekBar) {
            }
        });

        // Amplitude
        ((DiscreteSeekBar) findViewById(R.id.seek_bar_amplitude)).setOnProgressChangeListener(new DiscreteSeekBar.OnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                mWaveLoadingView.setAmplitudeRatio(value);
            }

            @Override
            public void onStartTrackingTouch(DiscreteSeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(DiscreteSeekBar seekBar) {
            }
        });

        // Wave Color
        ((LobsterShadeSlider) findViewById(R.id.shadeslider_wave_color)).addOnColorListener(new OnColorListener() {
            @Override
            public void onColorChanged(@ColorInt int color) {
                mWaveLoadingView.setWaveColor(color);
            }

            @Override
            public void onColorSelected(@ColorInt int color) {
            }
        });
        //Wave Background Color
        ((LobsterShadeSlider) findViewById(R.id.shadeslider_wave_background_color)).addOnColorListener(new OnColorListener() {
            @Override
            public void onColorChanged(@ColorInt int color) {
                mWaveLoadingView.setWaveBgColor(color);
            }

            @Override
            public void onColorSelected(@ColorInt int color) {
            }
        });

        // Border Color
        ((LobsterShadeSlider) findViewById(R.id.shadeslider_border_color)).addOnColorListener(new OnColorListener() {
            @Override
            public void onColorChanged(@ColorInt int color) {
                mWaveLoadingView.setBorderColor(color);
            }

            @Override
            public void onColorSelected(@ColorInt int color) {
            }
        });
    }

}
