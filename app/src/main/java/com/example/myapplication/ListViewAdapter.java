package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListViewAdapter extends RecyclerView.Adapter<ListViewAdapter.MyViewHolder>{

    private List<Model> modelList;

    // Constructor
    public ListViewAdapter(List<Model> model) {
        this.modelList = model;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.single_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.BrandName.setText(model.getBrandName());
        holder.imageView.setImageResource(model.getImageIcon());
        holder.Desc.setText(model.getDesc());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+model.brandName,Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }


    // Create a new class : MyViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView BrandName;
        public TextView Desc;
        public LinearLayout linearLayout;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.LogoImage);
            this.BrandName = (TextView) itemView.findViewById(R.id.LogoName);
            this.Desc = (TextView)itemView.findViewById(R.id.description);
            linearLayout = (LinearLayout)itemView.findViewById(R.id.linear);
        }
    }


    // LIST VIEW

//    //variables
//    Context mContext;
//    LayoutInflater inflater;
//    List<Model> modelList;
//    ArrayList<Model> arrayList;
//
//    //constructor
//    public ListViewAdapter(Context context, List<Model> modellist) {
//        mContext = context;
//        this.modelList = modellist;
//        inflater = LayoutInflater.from(mContext);
//        this.arrayList = new ArrayList<Model>();
//        this.arrayList.addAll(modellist);
//    }
//
//    public class ViewHolder{
//        TextView brandName, Description;
//        ImageView logoIcon;
//    }
//
//    @Override
//    public int getCount() {
//        return modelList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return modelList.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView(final int postition, View view, ViewGroup parent) {
//        ViewHolder holder;
//        if (view==null){
//            holder = new ViewHolder();
//            view = inflater.inflate(R.layout.single_item, null);
//
//            //locate the views in row.xml
//            holder.brandName = view.findViewById(R.id.LogoName);
//            holder.Description = view.findViewById(R.id.description);
//            holder.logoIcon = view.findViewById(R.id.LogoImage);
//
//            view.setTag(holder);
//
//        }
//        else {
//            holder = (ViewHolder)view.getTag();
//        }
//        //set the results into text views
//        holder.brandName.setText(modelList.get(postition).getBrandName());
//        holder.Description.setText(modelList.get(postition).getDesc());
//        //set the result in image view
//        holder.logoIcon.setImageResource(modelList.get(postition).getIcon());
//
//        //list view item clicks
//
//        return view;
//    }


}
