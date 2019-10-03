export default {
    lang: 'ja',
    dir: 'ltr',
    common: {
        ok: 'OK',
        cancel: 'キャンセル',
        key_backspace: 'backspace',
        key_del: '削除',
        key_down: 'down',
        key_up: 'up',
        more_opts: 'More Options',
        url: 'URL',
        width: 'Width',
        height: 'Height'
    },
    misc: {
        powered_by: 'Powered by'
    },
    ui: {
        toggle_stroke_tools: 'Show/hide more stroke tools',
        palette_info: 'クリックで塗りの色を選択、Shift+クリックで線の色を選択',
        zoom_level: 'ズーム倍率の変更',
        panel_drag: 'Drag left/right to resize side panel',
        quality: 'Quality:',
        pathNodeTooltip: 'Drag node to move it. Double-click node to change segment type',
        pathCtrlPtTooltip: 'Drag control point to adjust curve properties',
        pick_stroke_paint_opacity: 'Pick a Stroke Paint and Opacity',
        pick_fill_paint_opacity: 'Pick a Fill Paint and Opacity'
    },
    properties: {
        id: 'Identify the element',
        fill_color: '塗りの色を変更',
        stroke_color: '線の色を変更',
        stroke_style: '線種の変更',
        stroke_width: '線幅の変更',
        pos_x: 'X座標を変更',
        pos_y: 'Y座標を変更',
        linecap_butt: 'Linecap: Butt',
        linecap_round: 'Linecap: Round',
        linecap_square: 'Linecap: Square',
        linejoin_bevel: 'Linejoin: Bevel',
        linejoin_miter: 'Linejoin: Miter',
        linejoin_round: 'Linejoin: Round',
        angle: '回転角の変更',
        blur: 'Change gaussian blur value',
        opacity: '不透明度',
        circle_cx: '円の中心を変更（X座標）',
        circle_cy: '円の中心を変更（Y座標）',
        circle_r: '変更円の半径',
        ellipse_cx: '楕円の中心を変更（X座標）',
        ellipse_cy: '楕円の中心を変更（Y座標）',
        ellipse_rx: '楕円の半径を変更（X座標）',
        ellipse_ry: '楕円の半径を変更（Y座標）',
        line_x1: '開始X座標',
        line_x2: '終了X座標',
        line_y1: '開始Y座標',
        line_y2: '終了Y座標',
        rect_height: '長方形の高さを変更',
        rect_width: '長方形の幅を変更',
        corner_radius: '長方形の角の半径を変更',
        image_width: '画像の幅を変更',
        image_height: '画像の高さを変更',
        image_url: 'URLを変更',
        node_x: 'ノードのX座標を変更',
        node_y: 'ノードのY座標を変更',
        seg_type: '線分の種類を変更',
        straight_segments: '直線',
        curve_segments: 'カーブ',
        text_contents: 'テキストの内容の変更',
        font_family: 'フォントファミリーの変更',
        font_size: '文字サイズの変更',
        bold: '太字',
        italic: 'イタリック体'
    },
    tools: {
        main_menu: 'Main Menu',
        bkgnd_color_opac: '背景色/不透明度の変更',
        connector_no_arrow: 'No arrow',
        fitToContent: 'コンテンツに合わせる',
        fit_to_all: 'すべてのコンテンツに合わせる',
        fit_to_canvas: 'キャンバスに合わせる',
        fit_to_layer_content: 'レイヤー上のコンテンツに合わせる',
        fit_to_sel: '選択対象に合わせる',
        align_relative_to: '揃える',
        relativeTo: '相対:',
        page: 'ページ',
        largest_object: '最大のオブジェクト',
        selected_objects: '選択オブジェクト',
        smallest_object: '最小のオブジェクト',
        new_doc: '新規イメージ',
        open_doc: 'イメージを開く',
        export_img: 'Export',
        save_doc: '画像を保存',
        import_doc: 'Import Image',
        align_to_page: 'Align Element to Page',
        align_bottom: '下揃え',
        align_center: '中央揃え',
        align_left: '左揃え',
        align_middle: '中央揃え',
        align_right: '右揃え',
        align_top: '上揃え',
        mode_select: '選択ツール',
        mode_fhpath: '鉛筆ツール',
        mode_line: '直線ツール',
        mode_rect: 'Rectangle Tool',
        mode_square: 'Square Tool',
        mode_fhrect: 'フリーハンド長方形',
        mode_ellipse: '楕円',
        mode_circle: '円',
        mode_fhellipse: 'フリーハンド楕円',
        mode_path: 'パスツール',
        mode_text: 'テキストツール',
        mode_image: 'イメージツール',
        mode_zoom: 'ズームツール',
        no_embed: 'NOTE: This image cannot be embedded. It will depend on this path to be displayed',
        undo: '元に戻す',
        redo: 'やり直し',
        tool_source: 'ソースの編集',
        wireframe_mode: 'ワイヤーフレームで表示 [F]',
        clone: 'Clone Element(s)',
        del: 'Delete Element(s)',
        group_elements: 'グループ化',
        make_link: 'Make (hyper)link',
        set_link_url: 'Set link URL (leave empty to remove)',
        to_path: 'パスに変換',
        reorient_path: '現在の角度を０度とする',
        ungroup: 'グループ化を解除',
        docprops: '文書のプロパティ',
        move_bottom: '奥に移動',
        move_top: '手前に移動',
        node_clone: 'ノードを複製',
        node_delete: 'ノードを削除',
        node_link: '制御点の接続',
        add_subpath: 'Add sub-path',
        openclose_path: 'Open/close sub-path',
        source_save: '適用',
        cut: 'Cut',
        copy: 'Copy',
        paste: 'Paste',
        paste_in_place: 'Paste in Place',
        delete: 'Delete',
        group: 'Group',
        move_front: 'Bring to Front',
        move_up: 'Bring Forward',
        move_down: 'Send Backward',
        move_back: 'Send to Back'
    },
    layers: {
        layer: 'レイヤ',
        layers: 'Layers',
        del: 'レイヤの削除',
        move_down: 'レイヤを下へ移動',
        new: '新規レイヤ',
        rename: 'レイヤの名前を変更',
        move_up: 'レイヤを上へ移動',
        dupe: 'Duplicate Layer',
        merge_down: 'Merge Down',
        merge_all: 'Merge All',
        move_elems_to: '移動先レイヤ:',
        move_selected: '選択対象を別のレイヤに移動'
    },
    config: {
        image_props: 'イメージの設定',
        doc_title: 'タイトル',
        doc_dims: 'キャンバスの大きさ',
        included_images: '挿入された画像の扱い',
        image_opt_embed: 'SVGファイルに埋め込む',
        image_opt_ref: '画像を参照する',
        editor_prefs: 'エディタの設定',
        icon_size: 'アイコンの大きさ',
        language: '言語',
        background: 'エディタの背景色',
        editor_img_url: 'Image URL',
        editor_bg_note: '※背景色はファイルに保存されません。',
        icon_large: 'Large',
        icon_medium: 'Medium',
        icon_small: 'Small',
        icon_xlarge: 'Extra Large',
        select_predefined: 'デフォルト',
        units_and_rulers: 'Units & Rulers',
        show_rulers: 'Show rulers',
        base_unit: 'Base Unit:',
        grid: 'Grid',
        snapping_onoff: 'Snapping on/off',
        snapping_stepsize: 'Snapping Step-Size:',
        grid_color: 'Grid color'
    },
    notification: {
        invalidAttrValGiven: '無効な値が指定されています。',
        noContentToFitTo: '合わせる対象のコンテンツがありません。',
        dupeLayerName: '同名のレイヤーが既に存在します。',
        enterUniqueLayerName: '新規レイヤの一意な名前を入力してください。',
        enterNewLayerName: 'レイヤの新しい名前を入力してください。',
        layerHasThatName: '既に同名が付いています。',
        QmoveElemsToLayer: "選択した要素をレイヤー '%s' に移動しますか？",
        QwantToClear: 'キャンバスをクリアしますか？\nアンドゥ履歴も消去されます。',
        QwantToOpen: '新しいファイルを開きますか?\nアンドゥ履歴も消去されます。',
        QerrorsRevertToSource: 'ソースにエラーがあります。\n元のソースに戻しますか？',
        QignoreSourceChanges: 'ソースの変更を無視しますか？',
        featNotSupported: '機能はサポートされていません。',
        enterNewImgURL: '画像のURLを入力してください。',
        defsFailOnSave: 'NOTE: Due to a bug in your browser, this image may appear wrong (missing gradients or elements). It will however appear correct once actually saved.',
        loadingImage: 'Loading image, please wait...',
        saveFromBrowser: "Select 'Save As...' in your browser (possibly via file menu or right-click context-menu) to save this image as a %s file.",
        noteTheseIssues: 'Also note the following issues: ',
        unsavedChanges: 'There are unsaved changes.',
        enterNewLinkURL: 'Enter the new hyperlink URL',
        errorLoadingSVG: 'Error: Unable to load SVG data',
        URLLoadFail: 'Unable to load from URL',
        retrieving: 'Retrieving \'%s\' ...',
        popupWindowBlocked: 'Popup window may be blocked by browser',
        exportNoBlur: 'Blurred elements will appear as un-blurred',
        exportNoforeignObject: 'foreignObject elements will not appear',
        exportNoDashArray: 'Strokes will appear filled',
        exportNoText: 'Text may not appear as expected'
    }
};
