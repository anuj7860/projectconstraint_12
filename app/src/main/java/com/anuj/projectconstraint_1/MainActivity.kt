package com.anuj.projectconstraint_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

                import android.widget.ImageView
                import android.widget.Switch
                import android.widget.TextView

        class MainActivity : AppCompatActivity() {

            private lateinit var dca  :TextView
            lateinit var mars :TextView
            private lateinit var space :TextView
            private var flights : TextView? = null
            private lateinit var rovers :TextView
            private lateinit var one :TextView
            private lateinit var travel :TextView
            private var arrow : ImageView? = null
            private lateinit var swt : Switch
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                dca = this.findViewById(R.id.tv_1)
                mars= this.findViewById(R.id.tv_2)

                space= this.findViewById(R.id.sp_tv)
                flights=findViewById(R.id.flight_tv)
                rovers=findViewById(R.id.rovers_tv)
                one=findViewById(R.id.oneway_tv)
                travel=findViewById(R.id.travel_tv)
                arrow=findViewById(R.id.image_arrow)
                this.swt =findViewById(R.id.swt)
            }
        }


