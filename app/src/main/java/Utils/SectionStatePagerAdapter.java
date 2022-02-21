package Utils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SectionStatePagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mfragmentList = new ArrayList<>();
    private final HashMap<Fragment,Integer> mfragments = new HashMap<>();
    private final HashMap<String, Integer> mfragmentNumbers = new HashMap<String, Integer>();
    private final HashMap<Integer, Integer> mfragmentNames = new HashMap<Integer, Integer>();


    public SectionStatePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mfragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }
    private void addFragment(Fragment fragment,String fragmentName){
        mfragments.put(fragment,mfragmentList.size() -1);
        mfragmentNumbers.put(fragmentName, mfragmentList.size()-1);
        mfragmentNames.put(mfragmentList.size()-1, mfragmentList.size()-1);
    }
    public Integer getFragmentNumber(String fragmentName){
        if(mfragmentNumbers.containsKey(fragmentName)){
            return mfragmentNumbers.get(fragmentName);
        }else{
            return null;
        }
    }

    public Integer getFragmentNumber(Fragment fragment){
        if(mfragmentNumbers.containsKey(fragment)){
            return mfragmentNumbers.get(fragment);
        }else{
            return null;
        }
    }

    public Integer getFragmentName(Integer fragmentNumber){
        if(mfragmentNames.containsKey(fragmentNumber)){
            return mfragmentNames.get(fragmentNumber);
        }else{
            return null;
        }
    }
}
