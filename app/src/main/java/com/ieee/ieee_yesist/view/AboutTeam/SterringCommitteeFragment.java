package com.ieee.ieee_yesist.view.AboutTeam;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ieee.ieee_yesist.R;
import com.ieee.ieee_yesist.adapters.AboutTeamRecyclerAdapter;
import com.ieee.ieee_yesist.databinding.FragmentSterringCommitteeBinding;
import com.ieee.ieee_yesist.model.Professional;

import java.util.ArrayList;
import java.util.List;

public class SterringCommitteeFragment extends Fragment implements AboutTeamRecyclerAdapter.OnProfessionalListener {

    public SterringCommitteeFragment() {
        // Required empty public constructor
    }

    private FragmentSterringCommitteeBinding binding;
    private List<Professional> professionalList;
    private AboutTeamRecyclerAdapter adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        populateList();
        adapter = new AboutTeamRecyclerAdapter(requireContext(), professionalList, this);
        binding.sterringRv.setAdapter(adapter);
    }

    private void populateList() {
        professionalList = new ArrayList<>();
        professionalList.add(new Professional(getString(R.string.general_chair), R.drawable.ramlatha, "General Chair",
                getString(R.string.ramlatha), "https://www.linkedin.com/in/ramalatha-marimuthu-995b4a15/?originalSubdomain=in"));
        professionalList.add(new Professional(getString(R.string.secretary), R.drawable.nikhitha_k, "Secretary",
                getString(R.string.nikitha), "https://www.linkedin.com/in/nikitha-k7891/"));

        professionalList.add(new Professional(getString(R.string.maker_fair_co_chair_1), R.drawable.dev_sugandhika, getString(R.string.co_chair_maker_fair),
                getString(R.string.dev_sugandhika), "https://www.linkedin.com/in/wmdsugandhikajayalath/"));
        professionalList.add(new Professional(getString(R.string.maker_fair_co_chair_2), R.drawable.mian_junaid, getString(R.string.co_chair_maker_fair),
                getString(R.string.junaid), "https://www.linkedin.com/in/mian-junaid-manzoor-b552aa71/"));

        professionalList.add(new Professional(getString(R.string.junior_einstein_co_chair_1), R.drawable.navaneeth, getString(R.string.co_chair_junior_einstein),
                getString(R.string.naveneetha), "https://www.linkedin.com/in/navaneethakrishnan-ramanathan-2845b595/"));
        professionalList.add(new Professional(getString(R.string.junior_einstein_co_chair_2), R.drawable.pooja, getString(R.string.co_chair_junior_einstein),
                getString(R.string.pooja_sharma), "https://www.linkedin.com/in/pooja-sharmak"));

        professionalList.add(new Professional(getString(R.string.we_power_co_chair_1), R.drawable.preethy, getString(R.string.co_chair_we_power),
                getString(R.string.preethy), "https://www.linkedin.com/in/preethyvwarrier"));
        professionalList.add(new Professional(getString(R.string.we_power_co_chair_2), R.drawable.ramneek, getString(R.string.co_chair_we_power),
                getString(R.string.ramneek), "https://www.linkedin.com/in/ramneekkalra/"));

        professionalList.add(new Professional(getString(R.string.special_track_co_chair_1), R.drawable.vydeki, getString(R.string.co_chair_special_track),
                getString(R.string.vydeki), "https://in.linkedin.com/in/vydeki-vijayakumar-8a402456"));
        professionalList.add(new Professional(getString(R.string.special_track_co_chair_2), R.drawable.indumathi, getString(R.string.co_chair_special_track),
                getString(R.string.indhumathi), "https://www.linkedin.com/in/indhumathigunasekaran"));

        professionalList.add(new Professional(getString(R.string.innovation_challenge_co_chair_1), R.drawable.tasnim, getString(R.string.co_chair_innovation_challenge),
                getString(R.string.tasnim_shawkat), "https://www.linkedin.com/in/tasnim-binte-shawkat-05000b8a/"));
        professionalList.add(new Professional(getString(R.string.innovation_challenge_co_chair_2), R.drawable.bindu, getString(R.string.co_chair_innovation_challenge),
                getString(R.string.bindu), "https://www.linkedin.com/in/bindu-a-thomas-phd-93b6608a/"));

        professionalList.add(new Professional(getString(R.string.promotion_and_publicity_co_chair_1), R.drawable.aishwarya_bandla, getString(R.string.co_chair_pro_pub),
                getString(R.string.aishwarya), "https://www.linkedin.com/in/aishbandla/"));
        professionalList.add(new Professional(getString(R.string.promotion_and_publicity_co_chair_2), R.drawable.nithyavathy, getString(R.string.co_chair_pro_pub),
                getString(R.string.nithyavathi), "https://www.linkedin.com/in/nithyavathy-n"));

        professionalList.add(new Professional(getString(R.string.website_chair_1), R.drawable.ashwath, getString(R.string.co_chair_website),
                getString(R.string.ashvanth_b), "https://www.linkedin.com/in/ashvanth-b/"));
        professionalList.add(new Professional(getString(R.string.website_co_chair_2), R.drawable.arangan, getString(R.string.co_chair_website),
                getString(R.string.arangan), "https://www.linkedin.com/in/cyberking-io/"));

        professionalList.add(new Professional(getString(R.string.content_development_chair_1), R.drawable.janani, getString(R.string.co_chair_content_dev),
                getString(R.string.janani), "https://www.linkedin.com/in/jananiramachandran133/?originalSubdomain=in"));
        professionalList.add(new Professional(getString(R.string.content_development_chair_2), R.drawable.bharthi_ramesh_final, getString(R.string.co_chair_content_dev),
                getString(R.string.bharathi_ramesh), "https://www.linkedin.com/in/bharathi-ramesh-5ba9721a4/?originalSubdomain=in"));

        professionalList.add(new Professional(getString(R.string.section_collaboration_chair_1), R.drawable.darwin_jose, getString(R.string.co_chair_section_collab),
                getString(R.string.darwin_jose), "https://www.linkedin.com/in/dr-a-darwin-jose-raju-109b7015/"));
        professionalList.add(new Professional(getString(R.string.section_collaboration_chair_2), R.drawable.ankayar, getString(R.string.co_chair_section_collab),
                getString(R.string.ankayarkanni), "https://www.linkedin.com/in/ankayarkanni-r-0367b2169/"));

        professionalList.add(new Professional(getString(R.string.desgin_development_chair), R.drawable.tahmim, "Co Chair | Design and Development",
                getString(R.string.random_text), "https://www.linkedin.com/in/alagumeenaakshimuthiah19/"));

        professionalList.add(new Professional(getString(R.string.partnerships_co_chair), R.drawable.alagu, getString(R.string.co_chair_partnership),
                getString(R.string.alagu_meena), "https://www.linkedin.com/in/alagumeenaakshimuthiah19/"));

        professionalList.add(new Professional(getString(R.string.career_fair_chair), R.drawable.nageswara, getString(R.string.chair_career_fair),
                getString(R.string.nageswara), "https://www.linkedin.com/in/m-nageswara-guptha-24aba716a/"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSterringCommitteeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onProfessionalClick(Professional pro) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("selectedProfessional", pro);
        Navigation.findNavController(requireView()).navigate(R.id.action_aboutTeamFragment_to_professionalInfoFragment, bundle);
    }
}