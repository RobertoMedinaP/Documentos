package serco.project.documentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import serco.project.documentos.databinding.FragmentAsesoriaBinding

class AsesoriaFragment : Fragment() {

    private lateinit var binding: FragmentAsesoriaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_asesoria, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentAsesoriaBinding.inflate(layoutInflater)

        //Poner los botones
        binding.checkBox.isChecked=false

    }
}