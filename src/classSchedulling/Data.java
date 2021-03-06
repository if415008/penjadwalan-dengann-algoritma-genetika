package classSchedulling;

import java.util.ArrayList;
import java.util.Arrays;

import classSchedulling.domain.Course;
import classSchedulling.domain.Department;
import classSchedulling.domain.Lecturer;
import classSchedulling.domain.MeetingTime;
import classSchedulling.domain.Room;

public class Data {

    private ArrayList<Room> rooms;
    private ArrayList<Lecturer> lecturers;
    private ArrayList<Course> courses;
    private ArrayList<Department> depts;
    private ArrayList<MeetingTime> meetingtimes;
    private int numberOfClasses = 0;

    public Data() {
        initialize();
    }

    private Data initialize() {
        Room r1 = new Room("GD711", 30);
        Room r2 = new Room("GD712", 30);
        Room r3 = new Room("GD713", 30);
        Room r4 = new Room("GD714", 60);
        Room r5 = new Room("GD715", 30);
        Room r6 = new Room("GD716", 30);
        Room r7 = new Room("GD717", 30);
        Room r8 = new Room("GD721", 30);
        Room r9 = new Room("GD722", 90);
        Room r10 = new Room("GD723", 60);
        Room r11 = new Room("GD724", 30);
        Room r12 = new Room("GD725", 30);
        Room r13 = new Room("GD726", 30);
        Room r14 = new Room("GD513", 30);
        Room r15 = new Room("GD514", 30);
        Room r16 = new Room("GD515", 30);
        Room r17 = new Room("GD516", 30);
        Room r18 = new Room("GD524", 30);
        Room r19 = new Room("GD525", 30);
        Room r20 = new Room("GD526", 30);
        Room r21 = new Room("GD912", 30);
        Room r22 = new Room("GD913", 30);
        Room r23 = new Room("GD914", 30);
        Room r24 = new Room("GD916", 30);
        Room r25 = new Room("GD923", 30);
        Room r26 = new Room("GD924", 30);
        Room r27 = new Room("GD925", 30);
        Room r28 = new Room("GD927", 30);
        Room r29 = new Room("GD928", 30);
        Room r30 = new Room("GD929", 30);
        Room r31 = new Room("GD933", 30);
        Room r32 = new Room("GD934", 30);
        Room r33 = new Room("GD935", 30);
        Room r34 = new Room("GD937", 30);
        Room r35 = new Room("GD938", 30);
        Room r36 = new Room("GD939", 30);
        Room r37 = new Room("GD942", 30);
        Room r38 = new Room("GD943", 30);
        Room r39 = new Room("GD944", 30);
        Room r40 = new Room("GD812", 30);
        Room r41 = new Room("GD813", 30);
        Room r42 = new Room("GD814", 30);
        Room r43 = new Room("GD815", 30);
        Room r44 = new Room("GD825", 30);
        Room r45 = new Room("GD826", 30);
        rooms = new ArrayList<Room>(Arrays.asList(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45));
        MeetingTime meetingTime1 = new MeetingTime("MT1", "Senin 08:00 -09:00");
        MeetingTime meetingTime2 = new MeetingTime("MT2", "Senin 09:00 -10:00");
        MeetingTime meetingTime3 = new MeetingTime("MT3", "Senin 10:00 -11:00");
        MeetingTime meetingTime4 = new MeetingTime("MT4", "Senin 11:00 -12:00");
        MeetingTime meetingTime5 = new MeetingTime("MT5", "Senin 13:00 -14:00");
        MeetingTime meetingTime6 = new MeetingTime("MT6", "Senin 14:00 -15:00");
        MeetingTime meetingTime7 = new MeetingTime("MT7", "Senin 15:00 -16:00");
        MeetingTime meetingTime8 = new MeetingTime("MT8", "Senin 16:00 -17:00");
        MeetingTime meetingTime9 = new MeetingTime("MT9", "Selasa 08:00 -09:00");
        MeetingTime meetingTime10 = new MeetingTime("MT10", "Selasa 09:00 -10:00");
        MeetingTime meetingTime11 = new MeetingTime("MT11", "Selasa 10:00 -11:00");
        MeetingTime meetingTime12 = new MeetingTime("MT12", "Selasa 11:00 -12:00");
        MeetingTime meetingTime13 = new MeetingTime("MT13", "Selasa 13:00 -14:00");
        MeetingTime meetingTime14 = new MeetingTime("MT14", "Selasa 14:00 -15:00");
        MeetingTime meetingTime15 = new MeetingTime("MT15", "Selasa 15:00 -16:00");
        MeetingTime meetingTime16 = new MeetingTime("MT16", "Selasa 16:00 -17:00");
        MeetingTime meetingTime17 = new MeetingTime("MT17", "Rabu 08:00 -09:00");
        MeetingTime meetingTime18 = new MeetingTime("MT18", "Rabu 09:00 -10:00");
        MeetingTime meetingTime19 = new MeetingTime("MT19", "Rabu 10:00 -11:00");
        MeetingTime meetingTime20 = new MeetingTime("MT20", "Rabu 11:00 -12:00");
        MeetingTime meetingTime21 = new MeetingTime("MT21", "Rabu 13:00 -14:00");
        MeetingTime meetingTime22 = new MeetingTime("MT22", "Rabu 14:00 -15:00");
        MeetingTime meetingTime23 = new MeetingTime("MT23", "Rabu 15:00 -16:00");
        MeetingTime meetingTime24 = new MeetingTime("MT24", "Rabu 16:00 -17:00");
        MeetingTime meetingTime25 = new MeetingTime("MT25", "Kamis 08:00 -09:00");
        MeetingTime meetingTime26 = new MeetingTime("MT26", "Kamis 09:00 -10:00");
        MeetingTime meetingTime27 = new MeetingTime("MT27", "Kamis 10:00 -11:00");
        MeetingTime meetingTime28 = new MeetingTime("MT28", "Kamis 11:00 -12:00");
        MeetingTime meetingTime29 = new MeetingTime("MT29", "Kamis 13:00 -14:00");
        MeetingTime meetingTime30 = new MeetingTime("MT30", "Kamis 14:00 -15:00");
        MeetingTime meetingTime31 = new MeetingTime("MT31", "Kamis 15:00 -16:00");
        MeetingTime meetingTime32 = new MeetingTime("MT32", "Kamis 16:00 -17:00");
        MeetingTime meetingTime33 = new MeetingTime("MT33", "Jumat 08:00 -09:00");
        MeetingTime meetingTime34 = new MeetingTime("MT34", "Jumat 09:00 -10:00");
        MeetingTime meetingTime35 = new MeetingTime("MT35", "Jumat 10:00 -11:00");
        MeetingTime meetingTime36 = new MeetingTime("MT36", "Jumat 11:00 -12:00");
        MeetingTime meetingTime37 = new MeetingTime("MT37", "Jumat 13:00 -14:00");
        MeetingTime meetingTime38 = new MeetingTime("MT38", "Jumat 14:00 -15:00");
        MeetingTime meetingTime39 = new MeetingTime("MT39", "Jumat 15:00 -16:00");
        MeetingTime meetingTime40 = new MeetingTime("MT40", "Jumat 16:00 -17:00");
        meetingtimes = new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4, meetingTime5, meetingTime6, meetingTime7, meetingTime8, meetingTime9, meetingTime10, meetingTime11, meetingTime12, meetingTime13, meetingTime14, meetingTime15, meetingTime16, meetingTime17, meetingTime18, meetingTime19, meetingTime20, meetingTime21, meetingTime22, meetingTime23, meetingTime24, meetingTime25, meetingTime26, meetingTime27, meetingTime28, meetingTime29, meetingTime30, meetingTime31, meetingTime32, meetingTime33, meetingTime34, meetingTime35, meetingTime36, meetingTime37, meetingTime38, meetingTime39, meetingTime40));
        Lecturer lecturer1 = new Lecturer("1", "Roy Deddy Hasiholan Lumban Tobing, S.T., M.ICT");
        Lecturer lecturer2 = new Lecturer("2", "Ike Fitriyaningsih, S.Si., M.Si");
        Lecturer lecturer3 = new Lecturer("3", "Anthon Roberto Tampubolon, S.Kom, M.T");
        Lecturer lecturer4 = new Lecturer("4", "Rumondang Miranda Marsaulina, S.P, M.Si");
        Lecturer lecturer5 = new Lecturer("5", "Dr. Arlinta Christy Barus, S.T., M.InfoTech");
        Lecturer lecturer6 = new Lecturer("6", "Riyanthi Angrainy Sianturi, S.Sos, M.Ds");
        Lecturer lecturer7 = new Lecturer("7", "Verawaty Situmorang, S.Kom., M.T.I");
        Lecturer lecturer8 = new Lecturer("8", "Togu Novriansyah Turnip, S.S.T., M.IM");
        Lecturer lecturer9 = new Lecturer("9", "Tulus Pardamean Simanjuntak, SST");
        Lecturer lecturer10 = new Lecturer("10", "Arie Satia Dharma, S.T, M.Kom");
        Lecturer lecturer11 = new Lecturer("11", "Nenni Mona Aruan, S.Pd., M.Si");
        Lecturer lecturer12 = new Lecturer("12", "Teamsar Muliadi Panggabean");
        Lecturer lecturer13 = new Lecturer("13", "Santi Agustina Manalu, S.S., M.Pd");
        Lecturer lecturer14 = new Lecturer("14", "Mariana Simanjuntak, S.S, M.Sc");
        Lecturer lecturer15 = new Lecturer("15", "I Gde Eka Dirgayussa, S.Pd,M.Si");
        Lecturer lecturer16 = new Lecturer("16", "Gerry Italiano Wowiling, S.Tr.Kom");
        Lecturer lecturer17 = new Lecturer("17", "Inte Christinawati Bu'ulolo, ST., M.T.I");
        Lecturer lecturer18 = new Lecturer("18", "Ellyas Alga Nainggolan, S.TP, M.Sc");
        Lecturer lecturer19 = new Lecturer("19", "Adelina Manurung, S.Si, M.Sc");
        Lecturer lecturer20 = new Lecturer("20", "Andy Trirakhmadi, S.T, M.T");
        Lecturer lecturer21 = new Lecturer("21", "Dr. Merry Meryam Martgrita, S.Si, M.Si");
        Lecturer lecturer22 = new Lecturer("22", "Dra. Roga Florida Kembaren, M.Si");
        Lecturer lecturer23 = new Lecturer("23", "Monita Pasaribu, S.Si., MT.");
        Lecturer lecturer24 = new Lecturer("24", "Rien Rakhmana, S.Si, M.T");
        Lecturer lecturer25 = new Lecturer("25", "Yulisa Lestari., S.Si, M.T");
        Lecturer lecturer26 = new Lecturer("26", "Bonar Lumban Tobing");
        Lecturer lecturer27 = new Lecturer("27", "Christoper Janwar Saputra Sinaga");
        Lecturer lecturer28 = new Lecturer("28", "Devis Wawan Saputra, ST., MBA");
        Lecturer lecturer29 = new Lecturer("29", "Dr. Yosef Barita Sar Manik, S.T, M.Sc");
        Lecturer lecturer30 = new Lecturer("30", "Hadi Sutanto Saragi, S.T, M.Eng");
        Lecturer lecturer31 = new Lecturer("31", "Ir. Partumpuan Naiborhu, M.M");
        Lecturer lecturer32 = new Lecturer("32", "Niko Saripson P. Simamora");
        Lecturer lecturer33 = new Lecturer("33", "Prof.Ir. Togar M. Simatupang, M.Tech., Ph.D.");
        Lecturer lecturer34 = new Lecturer("34", "Ricardo Chandra Situmeang, S.Psi, M.A");
        Lecturer lecturer35 = new Lecturer("35", "Rizal Horas Manahan Sinaga, S.Si., M.T");
        Lecturer lecturer36 = new Lecturer("36", "Eka Stephani Sinambela, SST., M.Sc");
        Lecturer lecturer37 = new Lecturer("37", "Good Fried Panggabean, ST, MT");
        Lecturer lecturer38 = new Lecturer("38", "Marojahan Mula Timbul Sigiro, ST, M.Sc");
        Lecturer lecturer39 = new Lecturer("39", "Fidelis Haposan Silalahi, SH., MH");
        Lecturer lecturer40 = new Lecturer("40", "Parmonangan Rotua Togatorop, S.Kom., M.T.I");
        Lecturer lecturer41 = new Lecturer("41", "Rentauli Mariah Silalahi, S.Pd, M. Ed");
        Lecturer lecturer42 = new Lecturer("42", "Samuel Indra Gunawan Situmeang");
        Lecturer lecturer43 = new Lecturer("43", "Tennov Simanjuntak, S.T, M.Sc");
        Lecturer lecturer44 = new Lecturer("44", "Lit Malem Ginting, S.Si, MT");
        Lecturer lecturer45 = new Lecturer("45", "Mario Elyezer Subekti Simaremare, S.Kom., M.Sc");
        Lecturer lecturer46 = new Lecturer("46", "Mukhammad Solikhin, S.Si, M.Si");
        Lecturer lecturer47 = new Lecturer("47", "Tiurma Lumban Gaol, SP, M.P");
        Lecturer lecturer48 = new Lecturer("48", "Yaya Setiyadi, S.Si, M.T");
        Lecturer lecturer49 = new Lecturer("49", "Yuniarta Basani, S.Si, M.Si");
        Lecturer lecturer50 = new Lecturer("50", "Charla Tri Selda Manik, ST., M.Eng");
        Lecturer lecturer51 = new Lecturer("51", "Christin Erniati Panjaitan, ST., M.Sc");
        Lecturer lecturer52 = new Lecturer("52", "Dr. Ir. Bambang S.P. Abednego");
        Lecturer lecturer53 = new Lecturer("53", "Indra Hartarto Tambunan, Ph.D.");
        Lecturer lecturer54 = new Lecturer("54", "Pandapotan Siagian, ST, M.Eng");
        Lecturer lecturer55 = new Lecturer("55", "Santi Febri Arianti, S.Si, M.Sc");
        lecturers = new ArrayList<Lecturer>(Arrays.asList(lecturer1, lecturer2, lecturer3, lecturer4, lecturer5, lecturer6, lecturer7, lecturer8, lecturer9, lecturer10, lecturer11, lecturer12, lecturer13, lecturer14, lecturer15, lecturer16, lecturer17, lecturer18, lecturer19, lecturer20, lecturer21, lecturer22, lecturer23, lecturer24, lecturer25, lecturer26, lecturer27, lecturer28, lecturer29, lecturer30, lecturer31, lecturer32, lecturer33, lecturer34, lecturer35, lecturer36, lecturer37, lecturer38, lecturer39, lecturer40, lecturer41, lecturer42, lecturer43, lecturer44, lecturer45, lecturer46, lecturer47, lecturer48, lecturer49, lecturer50, lecturer51, lecturer52, lecturer53, lecturer54, lecturer55));
        Course MK1 = new Course("MK1", "Pengujian Perangkat Lunak", new ArrayList<Lecturer>(Arrays.asList(lecturer5)), 120);
        Course MK2 = new Course("MK2", "Pengembangan Aplikasi Mobile", new ArrayList<Lecturer>(Arrays.asList(lecturer1)), 120);
        Course MK3 = new Course("MK3", "Pemrograman Berorientasi Objek", new ArrayList<Lecturer>(Arrays.asList(lecturer1, lecturer17, lecturer37, lecturer44, lecturer45)), 60);
        Course MK4 = new Course("MK4", "Proyek Akhir III", new ArrayList<Lecturer>(Arrays.asList(lecturer6)), 30);
        Course MK5 = new Course("MK5", "Machine Learning", new ArrayList<Lecturer>(Arrays.asList(lecturer3, lecturer2)), 30);
        Course MK6 = new Course("MK6", "Certan", new ArrayList<Lecturer>(Arrays.asList(lecturer3)), 30);
        Course MK7 = new Course("MK7", "English VI", new ArrayList<Lecturer>(Arrays.asList(lecturer4, lecturer13)), 60);
        Course MK8 = new Course("MK8", "Komputer dan Masyarakat", new ArrayList<Lecturer>(Arrays.asList(lecturer11, lecturer10)), 60);
        Course MK9 = new Course("MK9", "Pengembangan Situs Web II", new ArrayList<Lecturer>(Arrays.asList(lecturer8, lecturer12)), 90);
        Course MK10 = new Course("MK10", "Algoritma & Struktur Data", new ArrayList<Lecturer>(Arrays.asList(lecturer12, lecturer17)), 120);
        Course MK11 = new Course("MK11", "Biologi Umum", new ArrayList<Lecturer>(Arrays.asList(lecturer21)), 30);
        Course MK12 = new Course("MK12", "Pengembangan Aplikasi Terdistribusi", new ArrayList<Lecturer>(Arrays.asList(lecturer8, lecturer12)), 60);
        Course MK13 = new Course("MK13", "Fisdas", new ArrayList<Lecturer>(Arrays.asList(lecturer15)), 120);
        Course MK14 = new Course("MK14", "Jaringan Komputer", new ArrayList<Lecturer>(Arrays.asList(lecturer16, lecturer54, lecturer38)), 60);
        Course MK15 = new Course("MK15", "Perancangan Antar Muka Pengguna", new ArrayList<Lecturer>(Arrays.asList(lecturer9, lecturer54)), 30);
        Course MK16 = new Course("MK16", "Kepal", new ArrayList<Lecturer>(Arrays.asList(lecturer8)), 60);
        Course MK17 = new Course("MK17", "Termo", new ArrayList<Lecturer>(Arrays.asList(lecturer18)), 60);
        Course MK18 = new Course("MK18", "Sisop", new ArrayList<Lecturer>(Arrays.asList(lecturer9)), 60);
        Course MK19 = new Course("MK19", "Matematika Diskrit", new ArrayList<Lecturer>(Arrays.asList(lecturer49, lecturer46, lecturer11)), 120);
        Course MK20 = new Course("MK20", "Bahasa Inggris II", new ArrayList<Lecturer>(Arrays.asList(lecturer4, lecturer13, lecturer41)), 120);
        Course MK21 = new Course("MK21", "Pengenalan Basis Data", new ArrayList<Lecturer>(Arrays.asList(lecturer7, lecturer8)), 60);
        Course MK22 = new Course("MK22", "Analisis Kebutuhan Perangkat Lunak", new ArrayList<Lecturer>(Arrays.asList(lecturer7)), 30);
        Course MK23 = new Course("MK23", "Proyek Akhir Tahun I", new ArrayList<Lecturer>(Arrays.asList(lecturer3, lecturer5, lecturer1, lecturer54)), 120);
        Course MK24 = new Course("MK24", "Praktikum Biologi Umum", new ArrayList<Lecturer>(Arrays.asList(lecturer19, lecturer21)), 30);
        Course MK25 = new Course("MK25", "Mikrobiologi Industri", new ArrayList<Lecturer>(Arrays.asList(lecturer19)), 30);
        Course MK26 = new Course("MK26", "Fisiologi", new ArrayList<Lecturer>(Arrays.asList(lecturer19)), 30);
        Course MK27 = new Course("MK27", "Analisis Pemodelan dan Komputasi Proses I", new ArrayList<Lecturer>(Arrays.asList(lecturer20)), 30);
        Course MK28 = new Course("MK28", "Kerja Praktek", new ArrayList<Lecturer>(Arrays.asList(lecturer51, lecturer7, lecturer11, lecturer18, lecturer42, lecturer55, lecturer20)), 30);
        Course MK29 = new Course("MK29", "Laboratorium Teknik Bioproses", new ArrayList<Lecturer>(Arrays.asList(lecturer20, lecturer23)), 30);
        Course MK30 = new Course("MK30", "Perancangan Pabrik", new ArrayList<Lecturer>(Arrays.asList(lecturer20, lecturer23, lecturer24, lecturer25)), 30);
        Course MK31 = new Course("MK31", "Etika Profesional", new ArrayList<Lecturer>(Arrays.asList(lecturer21, lecturer14, lecturer15)), 30);
        Course MK32 = new Course("MK32", "Genetika dan Biologi Molekuler", new ArrayList<Lecturer>(Arrays.asList(lecturer22)), 30);
        Course MK33 = new Course("MK33", "Praktikum Genetika dan Biologi Molekuler", new ArrayList<Lecturer>(Arrays.asList(lecturer22)), 30);
        Course MK34 = new Course("MK34", "Kimia Organik", new ArrayList<Lecturer>(Arrays.asList(lecturer22)), 30);
        Course MK35 = new Course("MK35", "Praktikum Biokimia", new ArrayList<Lecturer>(Arrays.asList(lecturer22, lecturer23)), 30);
        Course MK36 = new Course("MK36", "Proyek Akhir II (Penelitian)", new ArrayList<Lecturer>(Arrays.asList(lecturer22, lecturer23)), 30);
        Course MK37 = new Course("MK37", "Teknologi Proses dan Produk Hayati", new ArrayList<Lecturer>(Arrays.asList(lecturer18)), 30);
        Course MK38 = new Course("MK38", "Pengantar Desain Rekayasa", new ArrayList<Lecturer>(Arrays.asList(lecturer18, lecturer34, lecturer35)), 30);
        Course MK39 = new Course("MK39", "Operasi Fisik Pendukung I", new ArrayList<Lecturer>(Arrays.asList(lecturer23, lecturer24)), 30);
        Course MK40 = new Course("MK40", "Termodinamika Kimiawi", new ArrayList<Lecturer>(Arrays.asList(lecturer23)), 30);
        Course MK41 = new Course("MK41", "Analisis Instrumental", new ArrayList<Lecturer>(Arrays.asList(lecturer24, lecturer25)), 30);
        Course MK42 = new Course("MK42", "Kinetika dan Katalisa", new ArrayList<Lecturer>(Arrays.asList(lecturer24, lecturer25)), 30);
        Course MK43 = new Course("MK43", "Praktikum Analisis Instrumental", new ArrayList<Lecturer>(Arrays.asList(lecturer24, lecturer25)), 30);
        Course MK44 = new Course("MK44", "Analisis Dampak Lingkungan", new ArrayList<Lecturer>(Arrays.asList(lecturer25)), 60);
        Course MK45 = new Course("MK45", "Agama dan Etika", new ArrayList<Lecturer>(Arrays.asList(lecturer26, lecturer14)), 60);
        Course MK46 = new Course("MK46", "Perencanaan dan Pengendalian Produksi", new ArrayList<Lecturer>(Arrays.asList(lecturer27)), 90);
        Course MK47 = new Course("MK47", "Rekayasa Logistik", new ArrayList<Lecturer>(Arrays.asList(lecturer27)), 120);
        Course MK48 = new Course("MK48", "Berpikir Sistem", new ArrayList<Lecturer>(Arrays.asList(lecturer28)), 30);
        Course MK49 = new Course("MK49", "Pembiayaan Proyek", new ArrayList<Lecturer>(Arrays.asList(lecturer28, lecturer32)), 60);
        Course MK50 = new Course("MK50", "Kewirausahaan Berbasis Teknologi Lanjut", new ArrayList<Lecturer>(Arrays.asList(lecturer28)), 120);
        Course MK51 = new Course("MK51", "Praktikum Optimasi dan Simulasi Sistem", new ArrayList<Lecturer>(Arrays.asList(lecturer28, lecturer30, lecturer35)), 60);
        Course MK52 = new Course("MK52", "Pengantar Desain rekayasa", new ArrayList<Lecturer>(Arrays.asList(lecturer29)), 30);
        Course MK53 = new Course("MK53", "Praktikum Sistem Produksi", new ArrayList<Lecturer>(Arrays.asList(lecturer29, lecturer14, lecturer32)), 60);
        Course MK54 = new Course("MK54", "Tugas Akhir", new ArrayList<Lecturer>(Arrays.asList(lecturer29)), 60);
        Course MK55 = new Course("MK55", "Asesmen Teknologi", new ArrayList<Lecturer>(Arrays.asList(lecturer29)), 60);
        Course MK56 = new Course("MK56", "Manajemen Proyek Rekayasa", new ArrayList<Lecturer>(Arrays.asList(lecturer30, lecturer32, lecturer34)), 120);
        Course MK57 = new Course("MK57", "Penelitian Operasional I", new ArrayList<Lecturer>(Arrays.asList(lecturer30)), 120);
        Course MK58 = new Course("MK58", "Simulasi Sistem", new ArrayList<Lecturer>(Arrays.asList(lecturer30)), 60);
        Course MK59 = new Course("MK59", "Pancasila dan Kewarganegaraan", new ArrayList<Lecturer>(Arrays.asList(lecturer31)), 30);
        Course MK60 = new Course("MK60", "Kepemimpinan Bisnis", new ArrayList<Lecturer>(Arrays.asList(lecturer14)), 120);
        Course MK61 = new Course("MK61", "Socio-Informatika dan Profesionalisme", new ArrayList<Lecturer>(Arrays.asList(lecturer14, lecturer33, lecturer52)), 30);
        Course MK62 = new Course("MK62", "Kewirausahaan Berbasis Teknologi", new ArrayList<Lecturer>(Arrays.asList(lecturer34)), 30);
        Course MK63 = new Course("MK63", "Fisika Dasar II (+P)", new ArrayList<Lecturer>(Arrays.asList(lecturer35, lecturer11, lecturer15)), 30);
        Course MK64 = new Course("MK64", "Matematika Lanjut", new ArrayList<Lecturer>(Arrays.asList(lecturer35)), 30);
        Course MK65 = new Course("MK65", "Bahasa Inggris IV", new ArrayList<Lecturer>(Arrays.asList(lecturer13, lecturer4)), 30);
        Course MK66 = new Course("MK66", "Arsitektur dan Organisasi Komputer", new ArrayList<Lecturer>(Arrays.asList(lecturer36)), 30);
        Course MK67 = new Course("MK67", "Manajemen Media Penyimpanan Enterprise", new ArrayList<Lecturer>(Arrays.asList(lecturer36)), 30);
        Course MK68 = new Course("MK68", "Proyek Akhir Tahun II", new ArrayList<Lecturer>(Arrays.asList(lecturer36, lecturer5, lecturer1)), 30);
        Course MK69 = new Course("MK69", "Sistem Terdistribusi", new ArrayList<Lecturer>(Arrays.asList(lecturer36)), 30);
        Course MK70 = new Course("MK70", "Tugas Akhir II", new ArrayList<Lecturer>(Arrays.asList(lecturer36, lecturer1, lecturer55)), 30);
        Course MK71 = new Course("MK71", "Antar Jaringan II", new ArrayList<Lecturer>(Arrays.asList(lecturer16, lecturer54)), 30);
        Course MK72 = new Course("MK72", "Perancangan Sistem Tertanam", new ArrayList<Lecturer>(Arrays.asList(lecturer37)), 30);
        Course MK73 = new Course("MK73", "Praktikum Perancangan Sistem Tertanam", new ArrayList<Lecturer>(Arrays.asList(lecturer37)), 60);
        Course MK74 = new Course("MK74", "Pemrograman Sistem", new ArrayList<Lecturer>(Arrays.asList(lecturer38)), 60);
        Course MK75 = new Course("MK75", "Perangkat Lunak Sistem Jaringan", new ArrayList<Lecturer>(Arrays.asList(lecturer38, lecturer9)), 120);
        Course MK76 = new Course("MK76", "Praktikum Jaringan Komputer", new ArrayList<Lecturer>(Arrays.asList(lecturer38, lecturer9)), 120);
        Course MK77 = new Course("MK77", "Virtualisasi Komputer", new ArrayList<Lecturer>(Arrays.asList(lecturer38)), 60);
        Course MK78 = new Course("MK78", "Hukum dan Etika Cyber", new ArrayList<Lecturer>(Arrays.asList(lecturer39)), 30);
        Course MK79 = new Course("MK79", "Analisis Kebutuhan Sistem", new ArrayList<Lecturer>(Arrays.asList(lecturer40)), 30);
        Course MK80 = new Course("MK80", "Gudang Data dan Kecerdasan Bisnis", new ArrayList<Lecturer>(Arrays.asList(lecturer40, lecturer42)), 30);
        Course MK81 = new Course("MK81", "Manajemen Proyek", new ArrayList<Lecturer>(Arrays.asList(lecturer40)), 60);
        Course MK82 = new Course("MK82", "Perencanaan Sumber Daya Perusahaan", new ArrayList<Lecturer>(Arrays.asList(lecturer40)), 60);
        Course MK83 = new Course("MK83", "Proyek Sistem Informasi", new ArrayList<Lecturer>(Arrays.asList(lecturer40, lecturer42, lecturer43)), 90);

        Course MK85 = new Course("MK85", "Bahasa Inggris III", new ArrayList<Lecturer>(Arrays.asList(lecturer41)), 30);
        Course MK86 = new Course("MK86", "Data Mining", new ArrayList<Lecturer>(Arrays.asList(lecturer42)), 60);
        Course MK87 = new Course("MK87", "Grafika Komputer", new ArrayList<Lecturer>(Arrays.asList(lecturer42)), 120);
        Course MK88 = new Course("MK88", "Sistem Temu Balik Informasi", new ArrayList<Lecturer>(Arrays.asList(lecturer42)), 60);
        Course MK89 = new Course("MK89", "Dasar Sistem Informasi", new ArrayList<Lecturer>(Arrays.asList(lecturer43)), 30);
        Course MK90 = new Course("MK90", "Keamanan Sistem", new ArrayList<Lecturer>(Arrays.asList(lecturer43)), 60);
        Course MK91 = new Course("MK91", "Sistem Operasi", new ArrayList<Lecturer>(Arrays.asList(lecturer43, lecturer45)), 60);
        Course MK92 = new Course("MK92", "Kecerdasan Buatan", new ArrayList<Lecturer>(Arrays.asList(lecturer3)), 60);
        Course MK93 = new Course("MK93", "Pembelajaran Mesin", new ArrayList<Lecturer>(Arrays.asList(lecturer3, lecturer2)), 120);
        Course MK96 = new Course("MK96", "Strategi Algoritma", new ArrayList<Lecturer>(Arrays.asList(lecturer3, lecturer48)), 30);
        Course MK97 = new Course("MK97", "Studi Mandiri/Sertifikasi Profesional", new ArrayList<Lecturer>(Arrays.asList(lecturer3)), 120);
        Course MK98 = new Course("MK98", "Tugas Akhir II", new ArrayList<Lecturer>(Arrays.asList(lecturer3, lecturer48)), 30);
        Course MK99 = new Course("MK99", "Dasar Rekayasa Perangkat Lunak", new ArrayList<Lecturer>(Arrays.asList(lecturer6)), 30);
        Course MK100 = new Course("MK100", "Kapita Selekta", new ArrayList<Lecturer>(Arrays.asList(lecturer3)), 30);
        Course MK101 = new Course("MK101", "Pembangunan Aplikasi Berbasis Service", new ArrayList<Lecturer>(Arrays.asList(lecturer10)), 30);
        Course MK102 = new Course("MK102", "Manajemen Proyek Perangkat Lunak", new ArrayList<Lecturer>(Arrays.asList(lecturer5)), 30);
        Course MK103 = new Course("MK103", "Matematika Dasar II", new ArrayList<Lecturer>(Arrays.asList(lecturer2, lecturer45, lecturer49)), 30);
        Course MK104 = new Course("MK104", "Praktikum Optimasi dan Simulasi Bisnis", new ArrayList<Lecturer>(Arrays.asList(lecturer2)), 30);
        Course MK105 = new Course("MK105", "Probabilitas dan Statistik", new ArrayList<Lecturer>(Arrays.asList(lecturer2)), 30);
        Course MK106 = new Course("MK106", "Statistika Inferensi", new ArrayList<Lecturer>(Arrays.asList(lecturer2)), 30);
        Course MK107 = new Course("MK107", "Pengembangan Aplikasi pada Platform Khusus", new ArrayList<Lecturer>(Arrays.asList(lecturer44)), 30);
        Course MK108 = new Course("MK108", "Rekayasa Perangkat Lunak Berbasis Komponen", new ArrayList<Lecturer>(Arrays.asList(lecturer44)), 30);
        Course MK109 = new Course("MK109", "Pemrograman II", new ArrayList<Lecturer>(Arrays.asList(lecturer45, lecturer48)), 30);
        Course MK110 = new Course("MK110", "Proyek Sistem Informasi", new ArrayList<Lecturer>(Arrays.asList(lecturer45)), 30);
        Course MK111 = new Course("MK111", "Sistem Paralel dan Terdistribusi", new ArrayList<Lecturer>(Arrays.asList(lecturer45)), 30);
        Course MK112 = new Course("MK112", "Aljabar dan Geometri", new ArrayList<Lecturer>(Arrays.asList(lecturer46)), 30);
        Course MK113 = new Course("MK113", "Kalkulus Vektor dan Persamaan Diferensial Parsial", new ArrayList<Lecturer>(Arrays.asList(lecturer46, lecturer49)), 30);
        Course MK114 = new Course("MK114", "Interaksi Manusia dan Komputer", new ArrayList<Lecturer>(Arrays.asList(lecturer6)), 30);
        Course MK115 = new Course("MK115", "Pembelajaran Mesin Lanjut", new ArrayList<Lecturer>(Arrays.asList(lecturer12)), 30);
        Course MK116 = new Course("MK116", "Pengenalan Sistem Informasi dan Basis Data", new ArrayList<Lecturer>(Arrays.asList(lecturer8)), 30);
        Course MK117 = new Course("MK117", "Bahasa Indonesia", new ArrayList<Lecturer>(Arrays.asList(lecturer47)), 30);
        Course MK118 = new Course("MK118", "Tata Tulis Karya Ilmiah", new ArrayList<Lecturer>(Arrays.asList(lecturer47)), 60);
        Course MK119 = new Course("MK119", "Magang Industri", new ArrayList<Lecturer>(Arrays.asList(lecturer7)), 60);
        Course MK120 = new Course("MK120", "Kerja Praktek Industri", new ArrayList<Lecturer>(Arrays.asList(lecturer7)), 90);
        Course MK121 = new Course("MK121", "Pemecahan Masalah dengan C", new ArrayList<Lecturer>(Arrays.asList(lecturer48)), 120);
        Course MK122 = new Course("MK122", "Matematika Teknik II", new ArrayList<Lecturer>(Arrays.asList(lecturer49)), 30);
        Course MK123 = new Course("MK123", "Elektronika I", new ArrayList<Lecturer>(Arrays.asList(lecturer50, lecturer54)), 60);
        Course MK124 = new Course("MK124", "Pengantar Analisis Rangkaian", new ArrayList<Lecturer>(Arrays.asList(lecturer50)), 120);
        Course MK125 = new Course("MK125", "Praktikum Elektronika I", new ArrayList<Lecturer>(Arrays.asList(lecturer50, lecturer54)), 60);
        Course MK127 = new Course("MK127", "Tugas Akhir I dan Seminar", new ArrayList<Lecturer>(Arrays.asList(lecturer50)), 30);
        Course MK128 = new Course("MK128", "Sistem dan Sinyal", new ArrayList<Lecturer>(Arrays.asList(lecturer51)), 60);
        Course MK129 = new Course("MK129", "Sistem Komunikasi", new ArrayList<Lecturer>(Arrays.asList(lecturer51)), 60);
        Course MK130 = new Course("MK130", "Sistem Instrumentasi", new ArrayList<Lecturer>(Arrays.asList(lecturer52, lecturer55)), 60);
        Course MK131 = new Course("MK131", "Biomedics Engineering", new ArrayList<Lecturer>(Arrays.asList(lecturer15)), 120);
        Course MK132 = new Course("MK132", "Elektromagnetik", new ArrayList<Lecturer>(Arrays.asList(lecturer15)), 120);
        Course MK133 = new Course("MK133", "Praktikum Sistem Mikroprosesor", new ArrayList<Lecturer>(Arrays.asList(lecturer53)), 60);
        Course MK134 = new Course("MK134", "Sistem Kendali", new ArrayList<Lecturer>(Arrays.asList(lecturer53)), 30);
        Course MK135 = new Course("MK135", "Sistem Kendali Multivariabel", new ArrayList<Lecturer>(Arrays.asList(lecturer53)), 120);
        Course MK136 = new Course("MK136", "Sistem Mikroprosesor", new ArrayList<Lecturer>(Arrays.asList(lecturer53)), 30);
        Course MK137 = new Course("MK137", "Dasar Elektronika", new ArrayList<Lecturer>(Arrays.asList(lecturer54)), 30);
        Course MK138 = new Course("MK138", "Kimia Dasar", new ArrayList<Lecturer>(Arrays.asList(lecturer55)), 30);
        courses = new ArrayList<Course>(Arrays.asList(MK1, MK2, MK3, MK4, MK5, MK6, MK7, MK8, MK9, MK10, MK11, MK12, MK13, MK14, MK15, MK16, MK17, MK18, MK19, MK20, MK21, MK22, MK23, MK24, MK25, MK26, MK27, MK28, MK29, MK30, MK31, MK32, MK33, MK34, MK35, MK36, MK37, MK38, MK39, MK40, MK41, MK42, MK43, MK44, MK45, MK46, MK47, MK48, MK49, MK50, MK51, MK52, MK53, MK54, MK55, MK56, MK57, MK58, MK59, MK60, MK61, MK62, MK63, MK64, MK65, MK66, MK67, MK68, MK69, MK70, MK71, MK72, MK73, MK74, MK75, MK76, MK77, MK78, MK79, MK80, MK81, MK82, MK83, MK85, MK86, MK87, MK88, MK89, MK90, MK91, MK92, MK93, MK96, MK97, MK98, MK99, MK100, MK101, MK102, MK103, MK104, MK105, MK106, MK107, MK108, MK109, MK110, MK111, MK112, MK113, MK114, MK115, MK116, MK117, MK118, MK119, MK120, MK121, MK122, MK123, MK124, MK125, MK127, MK128, MK129, MK130, MK131, MK132, MK133, MK134, MK135, MK136, MK137, MK138));
        Department dept1 = new Department("11TI1", new ArrayList<Course>(Arrays.asList(MK51, MK38, MK99, MK63, MK20, MK109, MK103)));
        Department dept2 = new Department("41TI", new ArrayList<Course>(Arrays.asList(MK14, MK9, MK20, MK10, MK21, MK22)));
        Department dept3 = new Department("11TI2", new ArrayList<Course>(Arrays.asList(MK51, MK38, MK99, MK63, MK20, MK109, MK103)));
        Department dept4 = new Department("31TI1", new ArrayList<Course>(Arrays.asList(MK20, MK14, MK10, MK9, MK22, MK21)));
        Department dept5 = new Department("31TI2", new ArrayList<Course>(Arrays.asList(MK20, MK14, MK10, MK9, MK22, MK21)));
        Department dept6 = new Department("31TK", new ArrayList<Course>(Arrays.asList(MK3, MK15, MK10, MK117, MK137, MK14, MK23)));
        Department dept7 = new Department("11TE1", new ArrayList<Course>(Arrays.asList(MK38, MK103, MK20, MK124, MK63, MK138)));
        Department dept8 = new Department("11TE2", new ArrayList<Course>(Arrays.asList(MK38, MK103, MK20, MK124, MK63, MK138)));
        Department dept9 = new Department("11SI1", new ArrayList<Course>(Arrays.asList(MK38, MK89, MK103, MK63, MK118)));
        Department dept10 = new Department("11SI2", new ArrayList<Course>(Arrays.asList(MK38, MK89, MK103, MK63, MK118)));
        Department dept11 = new Department("11TB", new ArrayList<Course>(Arrays.asList(MK24, MK33, MK38, MK63, MK20, MK103)));
        Department dept12 = new Department("11MR1", new ArrayList<Course>(Arrays.asList(MK38, MK63, MK103, MK138)));
        Department dept13 = new Department("11MR2", new ArrayList<Course>(Arrays.asList(MK38, MK63, MK103, MK138)));
        Department dept14 = new Department("12TI1", new ArrayList<Course>(Arrays.asList(MK66, MK96, MK3, MK91, MK112)));
        Department dept15 = new Department("42TI", new ArrayList<Course>(Arrays.asList(MK1, MK68, MK105, MK3, MK2)));
        Department dept16 = new Department("12TI2", new ArrayList<Course>(Arrays.asList(MK66, MK96, MK3, MK91, MK112)));
        Department dept17 = new Department("32TI1", new ArrayList<Course>(Arrays.asList(MK65, MK1, MK68, MK3, MK2, MK12)));
        Department dept18 = new Department("32TI2", new ArrayList<Course>(Arrays.asList(MK65, MK1, MK68, MK3, MK2, MK12)));
        Department dept19 = new Department("32TK", new ArrayList<Course>(Arrays.asList(MK68, MK69, MK74, MK75)));
        Department dept20 = new Department("12TE1", new ArrayList<Course>(Arrays.asList(MK121, MK122, MK123, MK125, MK128, MK132)));
        Department dept21 = new Department("12TE2", new ArrayList<Course>(Arrays.asList(MK121, MK122, MK123, MK125, MK128, MK132)));
        Department dept22 = new Department("12SI1", new ArrayList<Course>(Arrays.asList(MK79, MK91, MK114)));
        Department dept23 = new Department("12SI2", new ArrayList<Course>(Arrays.asList(MK79, MK91, MK114)));
        Department dept24 = new Department("12TB", new ArrayList<Course>(Arrays.asList(MK27, MK11, MK24, MK32, MK33, MK35, MK37, MK39, MK35, MK40, MK41, MK43, MK113)));
        Department dept25 = new Department("12MR1", new ArrayList<Course>(Arrays.asList(MK46, MK48, MK53, MK57, MK56, MK64)));
        Department dept26 = new Department("12MR2", new ArrayList<Course>(Arrays.asList(MK46, MK48, MK53, MK57, MK56, MK64)));
        Department dept27 = new Department("13TI1", new ArrayList<Course>(Arrays.asList(MK44, MK45, MK61, MK87, MK102, MK107, MK111)));
        Department dept28 = new Department("43TI", new ArrayList<Course>(Arrays.asList(MK82, MK93, MK1, MK8, MK4, MK2, MK7)));
        Department dept29 = new Department("13TI2", new ArrayList<Course>(Arrays.asList(MK44, MK45, MK61, MK87, MK102, MK107, MK111)));
        Department dept30 = new Department("33TI", new ArrayList<Course>(Arrays.asList(MK70, MK8, MK2, MK1, MK7, MK120)));
        Department dept31 = new Department("33TK", new ArrayList<Course>(Arrays.asList(MK67, MK70, MK71, MK7, MK120)));
        Department dept32 = new Department("13TE1", new ArrayList<Course>(Arrays.asList(MK45, MK14, MK76, MK28, MK54, MK55, MK58, MK59, MK61)));
        Department dept33 = new Department("13TE2", new ArrayList<Course>(Arrays.asList(MK45, MK14, MK76, MK28, MK54, MK55, MK58, MK59, MK61)));
        Department dept34 = new Department("13SI1", new ArrayList<Course>(Arrays.asList(MK45, MK61, MK80, MK82, MK83, MK28, MK90)));
        Department dept35 = new Department("13SI2", new ArrayList<Course>(Arrays.asList(MK45, MK61, MK80, MK82, MK83, MK28, MK90)));
        Department dept36 = new Department("13TB", new ArrayList<Course>(Arrays.asList(MK25, MK26, MK29, MK42, MK45, MK50, MK116)));
        Department dept37 = new Department("13MR1", new ArrayList<Course>(Arrays.asList(MK44, MK47, MK49, MK50, MK51, MK56, MK59)));
        Department dept38 = new Department("13MR2", new ArrayList<Course>(Arrays.asList(MK44, MK47, MK49, MK50, MK51, MK56, MK59)));
        Department dept39 = new Department("14TI1", new ArrayList<Course>(Arrays.asList(MK60, MK78, MK101, MK108, MK115, MK98)));
        Department dept40 = new Department("44TI", new ArrayList<Course>(Arrays.asList(MK97, MK100, MK120, MK70)));
        Department dept41 = new Department("14TI2", new ArrayList<Course>(Arrays.asList(MK60, MK78, MK101, MK108, MK115, MK98)));
        Department dept42 = new Department("14TE1", new ArrayList<Course>(Arrays.asList(MK50, MK72, MK73, MK98, MK31, MK135)));
        Department dept43 = new Department("14TE2", new ArrayList<Course>(Arrays.asList(MK50, MK72, MK73, MK98, MK31, MK135)));
        Department dept44 = new Department("14SI1", new ArrayList<Course>(Arrays.asList(MK31, MK60, MK78, MK56, MK98, MK88)));
        Department dept45 = new Department("14SI2", new ArrayList<Course>(Arrays.asList(MK31, MK60, MK78, MK56, MK98, MK88)));
        Department dept46 = new Department("14TB", new ArrayList<Course>(Arrays.asList(MK28, MK30, MK31, MK36, MK60, MK85, MK86)));
        Department dept47 = new Department("14MR1", new ArrayList<Course>(Arrays.asList(MK45, MK54, MK55, MK58, MK31)));
        Department dept48 = new Department("14MR2", new ArrayList<Course>(Arrays.asList(MK45, MK54, MK55, MK58, MK31)));
        depts = new ArrayList<Department>(Arrays.asList(dept1, dept2, dept3, dept4, dept5, dept6, dept7, dept8, dept9, dept10, dept11, dept12, dept13, dept14, dept15, dept16, dept17, dept18, dept19, dept20, dept21, dept22, dept23, dept24, dept25, dept26, dept27, dept28, dept29, dept30, dept31, dept32, dept33, dept34, dept35, dept36, dept37, dept38, dept39, dept40, dept41, dept42, dept43, dept44, dept45, dept46, dept47, dept48));
        depts.forEach(x -> numberOfClasses += x.getCourses().size());

        return this;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Department> getDepts() {
        return depts;
    }

    public ArrayList<MeetingTime> getMeetingtimes() {
        return meetingtimes;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

}
