package data;

import java.util.ArrayList;
import java.util.List;
import models.MaintenanceMetrics;
import models.MaintenanceRequest;

public final class MaintenanceData {
    private MaintenanceData() {
    }

    public static List<MaintenanceRequest> createRequests() {
        List<MaintenanceRequest> requests = new ArrayList<>();

        requests.add(new MaintenanceRequest("MNT-001", "SERVIDOR DE ARCHIVOS", new MaintenanceMetrics(75.0, 3, 54, 12), 1));
        requests.add(new MaintenanceRequest("MNT-002", "cámara de seguridad", new MaintenanceMetrics(45.0, 2, 30, 6), 1));
        requests.add(new MaintenanceRequest("MNT-003", "Switch de distribución", new MaintenanceMetrics(45.0, 7, 12, 20), 5));
        requests.add(new MaintenanceRequest("MNT-004", "Router de sede", new MaintenanceMetrics(120.0, 3, 8, 2), 1));
        requests.add(new MaintenanceRequest("MNT-005", "Punto de acceso inalámbrico", new MaintenanceMetrics(120.0, 5, 8, 14), 5));
        requests.add(new MaintenanceRequest("MNT-006", "TERMINAL DE CONTROL", new MaintenanceMetrics(45.0, 5, 42, 6), 5));
        requests.add(new MaintenanceRequest("MNT-007", "unidad de almacenamiento", new MaintenanceMetrics(180.0, 3, 54, 10), 4));
        requests.add(new MaintenanceRequest("MNT-008", "Impresora institucional", new MaintenanceMetrics(90.0, 3, 24, 6), 1));
        requests.add(new MaintenanceRequest("MNT-009", "Equipo de respaldo", new MaintenanceMetrics(60.0, 2, 16, 2), 1));
        requests.add(new MaintenanceRequest("mnt-010", "Equipo de laboratorio", new MaintenanceMetrics(150.0, 5, 12, 10), 4));
        requests.add(new MaintenanceRequest("MNT-011", "SISTEMA DE VIDEOCONFERENCIA", new MaintenanceMetrics(75.0, 2, 54, 20), 1));
        requests.add(new MaintenanceRequest("MNT-012", "controlador de dominio", new MaintenanceMetrics(210.0, 8, 24, 24), 1));
        requests.add(new MaintenanceRequest("MNT-013", "Servidor de base de datos", new MaintenanceMetrics(105.0, 7, 42, 12), 2));
        requests.add(new MaintenanceRequest("MnT-014", "Lector de acceso", new MaintenanceMetrics(45.0, 6, 20, 24), 1));
        requests.add(new MaintenanceRequest("MNT-015", "Servidor de aplicaciones", new MaintenanceMetrics(150.0, 6, 54, 10), 1));
        requests.add(new MaintenanceRequest("MNT-016", "PROYECTOR DE AULA", new MaintenanceMetrics(60.0, 6, 16, 12), 2));
        requests.add(new MaintenanceRequest("MNT-017", "pantalla interactiva", new MaintenanceMetrics(90.0, 5, 30, 12), 4));
        requests.add(new MaintenanceRequest("MNT-018", "Estación de trabajo", new MaintenanceMetrics(150.0, 6, 12, 14), 2));
        requests.add(new MaintenanceRequest("MNT-019", "Servidor de archivos", new MaintenanceMetrics(210.0, 6, 16, 16), 5));
        requests.add(new MaintenanceRequest("mnt-020", "Cámara de seguridad", new MaintenanceMetrics(120.0, 8, 54, 2), 5));
        requests.add(new MaintenanceRequest("MNT-021", "SWITCH DE DISTRIBUCIÓN", new MaintenanceMetrics(120.0, 4, 20, 20), 5));
        requests.add(new MaintenanceRequest("MNT-022", "router de sede", new MaintenanceMetrics(105.0, 5, 24, 16), 4));
        requests.add(new MaintenanceRequest("MNT-023", "Punto de acceso inalámbrico", new MaintenanceMetrics(135.0, 3, 20, 6), 3));
        requests.add(new MaintenanceRequest("MNT-024", "Terminal de control", new MaintenanceMetrics(210.0, 8, 24, 8), 5));
        requests.add(new MaintenanceRequest("MNT-025", "Unidad de almacenamiento", new MaintenanceMetrics(90.0, 2, 20, 22), 2));
        requests.add(new MaintenanceRequest("MNT-026", "IMPRESORA INSTITUCIONAL", new MaintenanceMetrics(150.0, 5, 20, 12), 1));
        requests.add(new MaintenanceRequest("MNT-027", "equipo de respaldo", new MaintenanceMetrics(90.0, 2, 30, 4), 3));
        requests.add(new MaintenanceRequest("MnT-028", "Equipo de laboratorio", new MaintenanceMetrics(60.0, 4, 8, 18), 1));
        requests.add(new MaintenanceRequest("MNT-029", "Sistema de videoconferencia", new MaintenanceMetrics(165.0, 6, 30, 2), 3));
        requests.add(new MaintenanceRequest("mnt-030", "Controlador de dominio", new MaintenanceMetrics(45.0, 3, 42, 4), 3));
        requests.add(new MaintenanceRequest("MNT-031", "SERVIDOR DE BASE DE DATOS", new MaintenanceMetrics(90.0, 4, 54, 24), 4));
        requests.add(new MaintenanceRequest("MNT-032", "lector de acceso", new MaintenanceMetrics(135.0, 5, 54, 22), 2));
        requests.add(new MaintenanceRequest("MNT-033", "Servidor de aplicaciones", new MaintenanceMetrics(60.0, 4, 54, 6), 5));
        requests.add(new MaintenanceRequest("MNT-034", "Proyector de aula", new MaintenanceMetrics(90.0, 5, 42, 8), 3));
        requests.add(new MaintenanceRequest("MNT-035", "Pantalla interactiva", new MaintenanceMetrics(210.0, 4, 12, 16), 2));
        requests.add(new MaintenanceRequest("MNT-036", "ESTACIÓN DE TRABAJO", new MaintenanceMetrics(90.0, 5, 42, 12), 4));
        requests.add(new MaintenanceRequest("MNT-037", "servidor de archivos", new MaintenanceMetrics(60.0, 3, 20, 6), 4));
        requests.add(new MaintenanceRequest("MNT-038", "Cámara de seguridad", new MaintenanceMetrics(180.0, 2, 16, 8), 4));
        requests.add(new MaintenanceRequest("MNT-039", "Switch de distribución", new MaintenanceMetrics(30.0, 2, 36, 6), 1));
        requests.add(new MaintenanceRequest("mnt-040", "Router de sede", new MaintenanceMetrics(105.0, 7, 16, 10), 2));
        requests.add(new MaintenanceRequest("MNT-041", "PUNTO DE ACCESO INALÁMBRICO", new MaintenanceMetrics(210.0, 2, 48, 12), 1));
        requests.add(new MaintenanceRequest("MnT-042", "terminal de control", new MaintenanceMetrics(120.0, 8, 16, 20), 4));
        requests.add(new MaintenanceRequest("MNT-043", "Unidad de almacenamiento", new MaintenanceMetrics(105.0, 3, 30, 20), 5));
        requests.add(new MaintenanceRequest("MNT-044", "Impresora institucional", new MaintenanceMetrics(90.0, 2, 16, 16), 5));
        requests.add(new MaintenanceRequest("MNT-045", "Equipo de respaldo", new MaintenanceMetrics(105.0, 7, 36, 20), 5));
        requests.add(new MaintenanceRequest("MNT-046", "EQUIPO DE LABORATORIO", new MaintenanceMetrics(150.0, 6, 30, 18), 2));
        requests.add(new MaintenanceRequest("MNT-047", "sistema de videoconferencia", new MaintenanceMetrics(180.0, 8, 48, 16), 5));
        requests.add(new MaintenanceRequest("MNT-048", "Controlador de dominio", new MaintenanceMetrics(135.0, 7, 12, 12), 1));
        requests.add(new MaintenanceRequest("MNT-049", "Servidor de base de datos", new MaintenanceMetrics(180.0, 3, 20, 6), 1));
        requests.add(new MaintenanceRequest("mnt-050", "Lector de acceso", new MaintenanceMetrics(60.0, 6, 30, 6), 4));
        requests.add(new MaintenanceRequest("MNT-051", "SERVIDOR DE APLICACIONES", new MaintenanceMetrics(165.0, 7, 48, 4), 5));
        requests.add(new MaintenanceRequest("MNT-052", "proyector de aula", new MaintenanceMetrics(150.0, 7, 48, 16), 5));
        requests.add(new MaintenanceRequest("MNT-053", "Pantalla interactiva", new MaintenanceMetrics(105.0, 7, 42, 16), 2));
        requests.add(new MaintenanceRequest("MNT-054", "Estación de trabajo", new MaintenanceMetrics(45.0, 8, 12, 20), 1));
        requests.add(new MaintenanceRequest("MNT-055", "Servidor de archivos", new MaintenanceMetrics(45.0, 7, 20, 20), 2));
        requests.add(new MaintenanceRequest("MnT-056", "CÁMARA DE SEGURIDAD", new MaintenanceMetrics(45.0, 2, 42, 16), 1));
        requests.add(new MaintenanceRequest("MNT-057", "switch de distribución", new MaintenanceMetrics(105.0, 8, 42, 18), 3));
        requests.add(new MaintenanceRequest("MNT-058", "Router de sede", new MaintenanceMetrics(135.0, 6, 24, 22), 2));
        requests.add(new MaintenanceRequest("MNT-059", "Punto de acceso inalámbrico", new MaintenanceMetrics(75.0, 7, 48, 4), 2));
        requests.add(new MaintenanceRequest("mnt-060", "Terminal de control", new MaintenanceMetrics(75.0, 7, 20, 10), 2));
        requests.add(new MaintenanceRequest("MNT-061", "UNIDAD DE ALMACENAMIENTO", new MaintenanceMetrics(90.0, 6, 12, 2), 2));
        requests.add(new MaintenanceRequest("MNT-062", "impresora institucional", new MaintenanceMetrics(105.0, 2, 8, 4), 1));
        requests.add(new MaintenanceRequest("MNT-063", "Equipo de respaldo", new MaintenanceMetrics(120.0, 5, 36, 22), 2));
        requests.add(new MaintenanceRequest("MNT-064", "Equipo de laboratorio", new MaintenanceMetrics(135.0, 3, 24, 6), 5));
        requests.add(new MaintenanceRequest("MNT-065", "Sistema de videoconferencia", new MaintenanceMetrics(45.0, 8, 30, 20), 2));
        requests.add(new MaintenanceRequest("MNT-066", "CONTROLADOR DE DOMINIO", new MaintenanceMetrics(150.0, 7, 48, 22), 1));
        requests.add(new MaintenanceRequest("MNT-067", "servidor de base de datos", new MaintenanceMetrics(60.0, 2, 30, 2), 4));
        requests.add(new MaintenanceRequest("MNT-068", "Lector de acceso", new MaintenanceMetrics(60.0, 2, 30, 14), 4));
        requests.add(new MaintenanceRequest("MNT-069", "Servidor de aplicaciones", new MaintenanceMetrics(150.0, 6, 12, 12), 5));
        requests.add(new MaintenanceRequest("MnT-070", "Proyector de aula", new MaintenanceMetrics(30.0, 6, 8, 8), 2));
        requests.add(new MaintenanceRequest("MNT-071", "PANTALLA INTERACTIVA", new MaintenanceMetrics(150.0, 7, 54, 16), 2));
        requests.add(new MaintenanceRequest("MNT-072", "estación de trabajo", new MaintenanceMetrics(210.0, 7, 30, 18), 1));
        requests.add(new MaintenanceRequest("MNT-073", "Servidor de archivos", new MaintenanceMetrics(30.0, 7, 42, 16), 1));
        requests.add(new MaintenanceRequest("MNT-074", "Cámara de seguridad", new MaintenanceMetrics(165.0, 2, 42, 24), 4));
        requests.add(new MaintenanceRequest("MNT-075", "Switch de distribución", new MaintenanceMetrics(30.0, 5, 8, 18), 2));
        requests.add(new MaintenanceRequest("MNT-076", "ROUTER DE SEDE", new MaintenanceMetrics(75.0, 5, 54, 16), 5));
        requests.add(new MaintenanceRequest("MNT-077", "punto de acceso inalámbrico", new MaintenanceMetrics(105.0, 7, 30, 14), 1));
        requests.add(new MaintenanceRequest("MNT-078", "Terminal de control", new MaintenanceMetrics(75.0, 7, 24, 8), 3));
        requests.add(new MaintenanceRequest("MNT-079", "Unidad de almacenamiento", new MaintenanceMetrics(135.0, 4, 30, 10), 5));
        requests.add(new MaintenanceRequest("mnt-080", "Impresora institucional", new MaintenanceMetrics(75.0, 6, 12, 24), 2));
        requests.add(new MaintenanceRequest("MNT-081", "EQUIPO DE RESPALDO", new MaintenanceMetrics(180.0, 6, 16, 12), 2));
        requests.add(new MaintenanceRequest("MNT-082", "equipo de laboratorio", new MaintenanceMetrics(180.0, 6, 12, 24), 3));
        requests.add(new MaintenanceRequest("MNT-083", "Sistema de videoconferencia", new MaintenanceMetrics(90.0, 2, 42, 2), 5));
        requests.add(new MaintenanceRequest("MnT-084", "Controlador de dominio", new MaintenanceMetrics(45.0, 7, 36, 10), 2));
        requests.add(new MaintenanceRequest("MNT-085", "Servidor de base de datos", new MaintenanceMetrics(90.0, 8, 54, 16), 3));
        requests.add(new MaintenanceRequest("MNT-086", "LECTOR DE ACCESO", new MaintenanceMetrics(30.0, 7, 20, 22), 5));
        requests.add(new MaintenanceRequest("MNT-087", "servidor de aplicaciones", new MaintenanceMetrics(75.0, 2, 8, 14), 4));
        requests.add(new MaintenanceRequest("MNT-088", "Proyector de aula", new MaintenanceMetrics(105.0, 2, 24, 10), 2));
        requests.add(new MaintenanceRequest("MNT-089", "Pantalla interactiva", new MaintenanceMetrics(30.0, 7, 16, 22), 2));
        requests.add(new MaintenanceRequest("mnt-090", "Estación de trabajo", new MaintenanceMetrics(60.0, 7, 8, 4), 2));
        requests.add(new MaintenanceRequest("mnt-004", "rOUTER DE SEDE", new MaintenanceMetrics(120.0, 3, 8, 2), 1));
        requests.add(new MaintenanceRequest("mnt-009", "eQUIPO DE RESPALDO", new MaintenanceMetrics(60.0, 2, 16, 2), 1));
        requests.add(new MaintenanceRequest("mnt-016", "proyector de aula", new MaintenanceMetrics(60.0, 6, 16, 12), 2));
        requests.add(new MaintenanceRequest("mnt-023", "pUNTO DE ACCESO INALÁMBRICO", new MaintenanceMetrics(135.0, 3, 20, 6), 3));
        requests.add(new MaintenanceRequest("mnt-032", "LECTOR DE ACCESO", new MaintenanceMetrics(135.0, 5, 54, 22), 2));
        requests.add(new MaintenanceRequest("mnt-041", "punto de acceso inalámbrico", new MaintenanceMetrics(210.0, 2, 48, 12), 1));
        requests.add(new MaintenanceRequest("mnt-052", "PROYECTOR DE AULA", new MaintenanceMetrics(150.0, 7, 48, 16), 5));
        requests.add(new MaintenanceRequest("mnt-064", "eQUIPO DE LABORATORIO", new MaintenanceMetrics(135.0, 3, 24, 6), 5));
        requests.add(new MaintenanceRequest("mnt-077", "PUNTO DE ACCESO INALÁMBRICO", new MaintenanceMetrics(105.0, 7, 30, 14), 1));
        requests.add(new MaintenanceRequest("mnt-088", "pROYECTOR DE AULA", new MaintenanceMetrics(105.0, 2, 24, 10), 2));

        return requests;
    }
}
