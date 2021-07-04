package jeemaincutoffbyamit.example.jeemaincutoff;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<CountryModel> {

    private Context context;
    private List<CountryModel> countryModelsList;
    private List<CountryModel> countryModelsListFiltered;

    public MyCustomAdapter( Context context, List<CountryModel> countryModelsList) {
        super(context, R.layout.hello_layout,countryModelsList);

        this.context = context;
        this.countryModelsList = countryModelsList;
        this.countryModelsListFiltered = countryModelsList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hello_layout,null,true);
        TextView ins = view.findViewById(R.id.instituite);
        TextView cour = view.findViewById(R.id.course);
        TextView or = view.findViewById(R.id.or);
        TextView cr = view.findViewById(R.id.cr);
        TextView gender = view.findViewById(R.id.gender);
        TextView seat = view.findViewById(R.id.seat_type);
        TextView qua = view.findViewById(R.id.quota);




        ins.setText(countryModelsListFiltered.get(position).getInstitute());
        cour.setText(countryModelsListFiltered.get(position).getAcademic_Program_Name());
        or.setText(countryModelsListFiltered.get(position).getOpening_Rank());
        cr.setText(countryModelsListFiltered.get(position).getClosing_Rank());
        gender.setText(countryModelsListFiltered.get(position).getGender());
        seat.setText(countryModelsListFiltered.get(position).getSeat_Type());
        qua.setText(countryModelsListFiltered.get(position).getQuota());


        return view;
    }

    @Override
    public int getCount() {
        return countryModelsListFiltered.size();
    }

    @Nullable
    @Override
    public CountryModel getItem(int position) {
        return countryModelsListFiltered.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


}