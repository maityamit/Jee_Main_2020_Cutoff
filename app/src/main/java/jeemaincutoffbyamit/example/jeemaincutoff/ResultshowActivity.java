package jeemaincutoffbyamit.example.jeemaincutoff;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ResultshowActivity extends AppCompatActivity {


    EditText edtSearch;
    ListView listView;

    public static List<CountryModel> countryModelsList = new ArrayList<>();
    CountryModel countryModel;
    MyCustomAdapter myCustomAdapter;
    ProgressBar simpleArcLoader;
    int realrank = 0;
    String type = "";
    String rank = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultshow);

        rank = getIntent().getExtras().get("RANK").toString();
        type = getIntent().getExtras().get("TYPE").toString();

        realrank = Integer.parseInt(rank);



        edtSearch = findViewById(R.id.edtSearch);
        listView = findViewById(R.id.listView);
        simpleArcLoader = findViewById(R.id.loader);



        if (type.equals("CSAB")){
            fetchData();
        }
        else {
            fetchData2();
        }




        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                myCustomAdapter.getFilter().filter(s);
                myCustomAdapter.notifyDataSetChanged();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    private void fetchData() {

        String url  = "https://s41.aconvert.com/convert/p3r68-cdx67/z5ezw-3iznr.json";





        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONArray jsonArray = new JSONArray(response);

                            for(int i=0;i<jsonArray.length();i++){

                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                String institute_st = jsonObject.getString("Institute");
                                String academic_program_name_st = jsonObject.getString("Academic_0rogram_Name");
                                String quota_st = jsonObject.getString("Quota");
                                String seat_type_st = jsonObject.getString("Seat_Ty0e");
                                String gender_st = jsonObject.getString("Gender");
                                String opening_rank_st = jsonObject.getString("O0ening_Rank");
                                String closing_rank_st = jsonObject.getString("Closing_Rank");


                                int ie = Integer.parseInt(closing_rank_st);

                                if (ie>=realrank){
                                    countryModel = new CountryModel(institute_st,academic_program_name_st,quota_st,seat_type_st,gender_st,opening_rank_st,closing_rank_st);
                                    countryModelsList.add(countryModel);
                                }





                            }

                            myCustomAdapter = new MyCustomAdapter(ResultshowActivity.this,countryModelsList);
                            listView.setAdapter(myCustomAdapter);
                            simpleArcLoader.setVisibility(View.GONE);
                            simpleArcLoader.setVisibility(View.GONE);






                        } catch (JSONException e) {
                            e.printStackTrace();
                            simpleArcLoader.setVisibility(View.GONE);
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                simpleArcLoader.setVisibility(View.GONE);
                Toast.makeText(ResultshowActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);


    }

    private void fetchData2() {

        String url  = "https://s41.aconvert.com/convert/p3r68-cdx67/rey88-dteu6.json";





        StringRequest request = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONArray jsonArray = new JSONArray(response);

                            for(int i=0;i<jsonArray.length();i++){

                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                String institute_st = jsonObject.getString("Institute");
                                String academic_program_name_st = jsonObject.getString("Academic_0rogram_Name");
                                String quota_st = jsonObject.getString("Quota");
                                String seat_type_st = jsonObject.getString("Seat_Ty0e");
                                String gender_st = jsonObject.getString("Gender");
                                String opening_rank_st = jsonObject.getString("O0ening_Rank");
                                String closing_rank_st = jsonObject.getString("Closing_Rank");


                                int ie = Integer.parseInt(closing_rank_st);

                                if (ie>=realrank){
                                    countryModel = new CountryModel(institute_st,academic_program_name_st,quota_st,seat_type_st,gender_st,opening_rank_st,closing_rank_st);
                                    countryModelsList.add(countryModel);
                                }





                            }

                            myCustomAdapter = new MyCustomAdapter(ResultshowActivity.this,countryModelsList);
                            listView.setAdapter(myCustomAdapter);
                            simpleArcLoader.setVisibility(View.GONE);
                            simpleArcLoader.setVisibility(View.GONE);






                        } catch (JSONException e) {
                            e.printStackTrace();
                            simpleArcLoader.setVisibility(View.GONE);
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                simpleArcLoader.setVisibility(View.GONE);
                Toast.makeText(ResultshowActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);


    }

}