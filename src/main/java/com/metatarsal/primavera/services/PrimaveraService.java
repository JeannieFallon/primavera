package com.metatarsal.primavera.services;

import com.metatarsal.primavera.enums.Context;
import com.metatarsal.primavera.models.PrimaveraViewModel;

public interface PrimaveraService {
    PrimaveraViewModel getPrimaVM(Context context);
    PrimaveraViewModel getHomeFields(PrimaveraViewModel primaVM);
    PrimaveraViewModel getRot13Fields(PrimaveraViewModel primaVM);
    PrimaveraViewModel getCaesarFields(PrimaveraViewModel primaVM);
    PrimaveraViewModel getVigenereFields(PrimaveraViewModel primaVM);
}
