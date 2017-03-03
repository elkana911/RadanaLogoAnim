package radana.ppu.radanalogoanim;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rlRadana;
    RelativeLayout rlLeaf;
    RelativeLayout rlFinance;
    Button btnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rlRadana = (RelativeLayout) findViewById(R.id.rlRadana);
        rlLeaf = (RelativeLayout) findViewById(R.id.rlLeaf);
        rlFinance = (RelativeLayout) findViewById(R.id.rlFinance);

        btnAnim = (Button) findViewById(R.id.btnAnim);
        btnAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlRadana.clearAnimation();
                rlRadana.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(MainActivity.this, R.anim.layout_radana));
                rlRadana.setLayoutAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                rlRadana.startLayoutAnimation();

                rlLeaf.clearAnimation();
                rlLeaf.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(MainActivity.this, R.anim.layout_radana_leaf));
                rlLeaf.startLayoutAnimation();

                rlFinance.clearAnimation();
                rlFinance.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(MainActivity.this, R.anim.layout_radana_finance));
                rlFinance.startLayoutAnimation();
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
